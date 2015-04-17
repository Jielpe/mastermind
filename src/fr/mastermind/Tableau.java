package fr.mastermind;

import java.util.Scanner;

public class Tableau {
	static Scanner sc = new Scanner(System.in);
	
	/**
	 * Methode permettant de parcourir un tableau de string passe en parametre
	 * @param tab On donne en parametre un tableau de String
	 */
	public static void parcourirTab( String[] tab)
	{
		for (String str : tab)
		{
			System.out.println(str);
		}
	}
	
	/**
	 * Methode permettant de parcourir un tableau de int passe en parametre
	 * @param tab le parametre est un tableau de int
	 */
	public static void parcourirTab ( int[] tab )
	{
		for (int i : tab)
		{
			System.out.println(i);
		}
	}
	
	/**
	 * Methode prenant en parametre une question demandant a l'utilisateur un entier, renvoie l'entier en question.
	 * @param prompt Le parametre c'est la question.
	 * @return On renvoie la reponse de l'utilisateur a la question.
	 */
	public static int getInt ( String prompt )
	{
		int entier = 0;
		System.out.println( prompt + "");
		entier = sc.nextInt();
		// if typeOf entier != int ...
		return entier;
	}
	
}
