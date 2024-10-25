package sbj;

public class Banque {

	private CompteBancaire [] comptes;
	private static int nombreComptes ;
	
	public Banque(int tailleMax) {
        this.comptes = new CompteBancaire[tailleMax]; 
    }
	 public void ajouterCompte (CompteBancaire compte) {
		 if (nombreComptes < comptes.length) {
			 comptes[nombreComptes] = compte; 
			 nombreComptes++; 
			 System.out.println("Compte ajouté ");
		 }else {
			 System.out.println("impossible d ajouter le compte");
		 }
	 }
	 public CompteBancaire chercherCompte ( String numeroCompte) {
		 for (int i = 0;i <nombreComptes ; i++) {
			 if (comptes[i].getNumeroCompte().equals(numeroCompte)) {
				 return comptes[i];
				 
			 }
		 }
		 return null;
	 }
		 public void transfert(String numeroSource, String numeroDest, double montant) {
		
			    CompteBancaire compteSource = chercherCompte(numeroSource);
			    CompteBancaire compteDest = chercherCompte(numeroDest);
			    
			    
			    if (compteSource != null && compteDest != null) {
			        if (compteSource.getSolde() >= montant) {
			            
			            compteSource.retirer(montant);
			            
			            compteDest.deposer(montant);
			            System.out.println("Transfert réussi : " + montant + " a été transféré de " + numeroSource + " à " + numeroDest);
			        } else {
			            System.out.println("Solde insuffisant pour le transfert.");
			        }
			    } else {
			        System.out.println("Compte source ou destination introuvable.");
			    }
			}

		 
		 public static void afficherNombreComptes() {
			    System.out.println("Nombre total de comptes bancaires : " + nombreComptes);
			}
		 
	 }

	 
	

