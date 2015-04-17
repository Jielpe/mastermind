package fr.mastermind;

import java.util.Random;
import java.util.Scanner;

public class Mastermind {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Jeu de mastermind ( les pions sont repr�sent�s par 1 ou -1)
		String indice[] = new String[5]; // Tableau indiquant la situation du joueur en termes de pions bien ou mal plac�s
		int joueur[] = new int[5]; // D�claration du tableau du joueur
		int mm[] = new int[5]; // D�claration du tableau utilis� par l'ordinateur
		int val[] = {-1,1}; // Choix des pions
		int compteurDeFautes = 5; // D�claration du compteur de fautes, on initialise � 5 pour entrer dans la boucle
		//Cr�ation de la combinaison de l'ordinateur
		Random rand = new Random();
		for (int j = 0; j < mm.length ; j++)
		{
			int i  = rand.nextInt(val.length); // Choix al�atoire 0 ou 1
			mm[j] = val[i]; // On rempli notre tableau de 1 ou -1 selon l'indice obtenu al�atoirement
		}
		
		while ( compteurDeFautes != 0 ){// Tant que nous avons des fautes
			compteurDeFautes = 0;
			// On demande au joueur sa proposition de combinaison
			System.out.println("Vous allez entrer votre combinaison, soit 1 soit -1:"); 
			for (int i = 0; i < 5; i++)
			{
				// On propose la case i
				System.out.println("Case :"+i);
				// On r�cup�re le choix du joueur
				joueur[i] = sc.nextInt();
			}
			for ( int i = 0; i < 5 ; i++){
				// Comparaison
				if ( mm[i] + joueur[i] == 0 ){ // choix judicieux de la repr�sentation des pions, test simple
					// valeurs diff�rentes -> faute
					indice[i] = "mal plac�";
				}
				else {
					// Valeurs identiques
					indice[i] = "bien plac�";
				}
			}
			// R�capitulatif de la situation
			for ( int i =0; i < joueur.length; i++)
			{
				System.out.println("Case "+i+" : votre valeur : "+joueur[i]+" est : "+ indice[i]+".");
			}
			for ( String test : indice ) {
				// Parcours du tableau d'indications
				if ( test != "bien plac�") {
					// Dans le cas o� un �l�ment reste mal plac�, on incr�mente notre compteur
					compteurDeFautes++;
				}
			}
		}
		System.out.println("Bravo !");
		sc.close();
	}

}
