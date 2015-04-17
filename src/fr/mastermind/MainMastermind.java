package fr.mastermind;

import java.util.*;

public class MainMastermind {

	public static void main(String[] args) {
		// Jeu Mastermind
		
		// Declaration des variables
		// feuille de parametres
		Scanner sc = new Scanner(System.in);
		MastermindParam param = new MastermindParam();
		
		// Tableau indiquant la situation du joueur en termes de pions bien ou mal places
		String indice[] = new String[0];
		
		// Declaration du tableau du joueur
		int joueur[] = new int[0];
		
		// Declaration du tableau utilise par l'ordinateur
		int mm[] = new int[0]; 
		
		// Choix des pions
		int val[] = new int[0]; 
		
		// Declaration du compteur de fautes, on initialise a 5 pour entrer dans la boucle
		int compteurDeFautes = 0; 
		
		
		/*
		 * Choix des regles
		 */
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.println("%% M A S T E R M I N D %%");
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%");
		
		System.out.println("Bienvenue dans ce jeu de mastermind !");
		System.out.println("Avant de commencer, vous allez choisir vos regles.");
		System.out.println("Vous allez choisir : le nombre d'emplacements, le nombre de couleurs de pions (represente ici par des chiffres)");
		System.out.println("Et enfin le nombre d'essais que vous vous donnez pour trouver la bonne combinaison.");
		System.out.println("Avec combien d'emplacements de pions voulez vous jouer ?");
		param.setNbPions( sc.nextInt() );
		System.out.println("Avec combien de 'couleurs' de pions voulez vous jouer ?");
		param.setNbCategoriesPions ( sc.nextInt() );
		System.out.println("Combien d'essais max vous laissez vous pour trouver la bonne combinaison ?");
		param.setNbEssaisMax ( sc.nextInt() );
		System.out.println("L'ordinateur à placé ses pions, à vous de jouer ! Bon courage !");
		indice = new String[param.getNbPions()];
		joueur = new int[param.getNbPions() ];
		mm = new int[param.getNbPions() ];
		val = new int[param.getNbCategoriesPions() ];
		compteurDeFautes = param.getNbPions() ;
		Tableau.parcourirTab(mm);
		
		/*
		 * Jeu a proprement parler
		 */
		
		/*
		 * Fin du jeu
		 */
		sc.close();
	}

}
