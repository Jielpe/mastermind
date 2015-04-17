package fr.mastermind;

public class MastermindParam {
	// Choix des r�gles : on pourra choisir le nombre de pions et le nombre de pions diff�rents
	int nbPions; // Nombre de pion
	int nbCategoriesPions; // Nombre de categories de pions
	int nbEssaisMax; // Le joueur doit trouver la solution en nbEssaisTotal fois
	int[] tabCatPions = new int[10];// Tableau rempli des diff�rentes cat�rorie ex: {1,2,3,4}
	
	/**
	 * Methode qui prend en argument le nb de categories de pions defini par l'utilisateur
	 * Et qui va creer un tablea rempli des differents categories
	 * @param nbCategoriesPions
	 */
	public int [] creationTabCat ( int nbCategoriesPions )
	{
		
		for ( int i = 0; i < nbCategoriesPions+1; ++i)
		{
			tabCatPions[i] = i;
		}
		return tabCatPions;
	}
	 public MastermindParam(){
		 nbPions = 0;
		 nbCategoriesPions = 1;
		 nbEssaisMax = 0;
		 tabCatPions = creationTabCat( nbCategoriesPions );
	 }
	 
	 // Creation d'un jeu de parametre
	 public MastermindParam( int pNbPions, int pNbCategoriesPions, int pNbEssaisMax)
	 {
		 nbPions = pNbPions;
		 nbCategoriesPions = pNbCategoriesPions;
		 nbEssaisMax = pNbEssaisMax;
		 tabCatPions =  creationTabCat ( pNbCategoriesPions );
	 }
}
