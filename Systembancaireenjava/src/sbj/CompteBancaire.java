package sbj;

import java.util.ArrayList;

public class CompteBancaire {
private String numeroCompte;
private double solde;
private String titulaire;
private ArrayList<Transaction> historique;
public CompteBancaire(String numeroCompte, String titulaire,double solde) {
    this.numeroCompte = numeroCompte;
    this.titulaire = titulaire;
    this.solde = solde;
    this.historique = new ArrayList<>();
}
public void deposer(double montant) {
	if (montant >0) {
		solde +=montant;
		System.out.println("solde deposer"+solde);
		historique.add(new Transaction("deposer", montant));
	}
	else{
		System.out.println("Saisir un montant positif");
	}
}
public void retirer(double montant) {
	if (montant >0 && montant<=solde) {
		solde -=montant;
		System.out.println("solde retirer"+solde);
		historique.add(new Transaction("retirer :", montant));
	}
	else {
		System.out.println("erreur");
	}
}
public void afficherSolde() {
	System.out.println("le solde actuel"+solde);
}
public String getNumeroCompte() {
	return numeroCompte;
}
public double getSolde() {
	return solde;
}
public void setSolde(double solde) {
	this.solde=solde;
	
}
public void setTitulaire(String titulaire) {
	this.titulaire=titulaire;
}
public void afficherHistorique() {
    System.out.println("Historique des transactions pour le compte " + numeroCompte + " :");
    for (Transaction transaction : historique) {
        System.out.println(transaction);
    }
}
}
