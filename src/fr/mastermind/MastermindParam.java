package fr.mastermind;

public class MastermindParam {
	// Choix des r�gles : on pourra choisir le nombre de pions et le nombre de pions diff�rents
	
	// Nombre de pion
	private int nbPions; 
	
	// Nombre de categories de pions
	private int nbCategoriesPions; 
	
	// Le joueur doit trouver la solution en nbEssaisTotal fois
	private int nbEssaisMax; 
	
	// Tableau rempli des differentes caterories ex: {1,2,3,4}
	private int[] tabCatPions = new int[10];
	
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
	 public MastermindParam( int NbPions, int NbCategoriesPions, int NbEssaisMax)
	 {
		 this.nbPions = NbPions;
		 this.nbCategoriesPions = NbCategoriesPions;
		 this.nbEssaisMax = NbEssaisMax;
		 this.tabCatPions =  creationTabCat ( NbCategoriesPions );
	 }
	 
	 // Accesseur et getteur de nbPions
	 public void setNbPions ( int nbPions )
	 {
		 this.nbPions = nbPions;
	 }
	 
	 public int getNbPions ( )
	 {
		 return this.nbPions;
	 }
	 
	 // Accesseur et getteur de nbCategoriesPions
	 public void setNbCategoriesPions ( int nbCategoriesPions )
	 {
		 this.nbCategoriesPions = nbCategoriesPions;
	 }
	 
	 public int getNbCategoriesPions ( )
	 {
		 return this.nbCategoriesPions;
	 }
	 
	 // Accesseur et getteur de nbEssaisMax
	 public void setNbEssaisMax ( int nbEssaisMax )
	 {
		 this.nbEssaisMax = nbEssaisMax;
	 }
	 
	 public int getNbEssaisMax ( )
	 {
		 return this.nbEssaisMax;
	 }
	 
	 // Accesseur et getteur de tabCatPions
	 public void setTabCatPions ( int [] tabCatPions )
	 {
		 this.tabCatPions = tabCatPions;
	 }
	 
	 public int []  getTabCatPions ( )
	 {
		 return this.tabCatPions;
	 }
}
