package fr.mastermind;

import java.util.Random;
import java.util.Scanner;

public class Mastermind {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Jeu de mastermind ( les pions sont représentés par 1 ou -1)
		String indice[] = new String[5]; // Tableau indiquant la situation du joueur en termes de pions bien ou mal placés
		int joueur[] = new int[5]; // Déclaration du tableau du joueur
		int mm[] = new int[5]; // Déclaration du tableau utilisé par l'ordinateur
		int val[] = {-1,1}; // Choix des pions
		int compteurDeFautes = 5; // Déclaration du compteur de fautes, on initialise à 5 pour entrer dans la boucle
		//Création de la combinaison de l'ordinateur
		Random rand = new Random();
		for (int j = 0; j < mm.length ; j++)
		{
			int i  = rand.nextInt(val.length); // Choix aléatoire 0 ou 1
			mm[j] = val[i]; // On rempli notre tableau de 1 ou -1 selon l'indice obtenu aléatoirement
		}
		
		while ( compteurDeFautes != 0 ){// Tant que nous avons des fautes
			compteurDeFautes = 0;
			// On demande au joueur sa proposition de combinaison
			System.out.println("Vous allez entrer votre combinaison, soit 1 soit -1:"); 
			for (int i = 0; i < 5; i++)
			{
				// On propose la case i
				System.out.println("Case :"+i);
				// On récupère le choix du joueur
				joueur[i] = sc.nextInt();
			}
			for ( int i = 0; i < 5 ; i++){
				// Comparaison
				if ( mm[i] + joueur[i] == 0 ){ // choix judicieux de la représentation des pions, test simple
					// valeurs différentes -> faute
					indice[i] = "mal placé";
				}
				else {
					// Valeurs identiques
					indice[i] = "bien placé";
				}
			}
			// Récapitulatif de la situation
			for ( int i =0; i < joueur.length; i++)
			{
				System.out.println("Case "+i+" : votre valeur : "+joueur[i]+" est : "+ indice[i]+".");
			}
			for ( String test : indice ) {
				// Parcours du tableau d'indications
				if ( test != "bien placé") {
					// Dans le cas où un élément reste mal placé, on incrémente notre compteur
					compteurDeFautes++;
				}
			}
		}
		System.out.println("Bravo !");
		sc.close();
	}

}
