package sbj;

public class CompteCourant extends CompteBancaire {
    private double decouvertAutorise;

   
    public CompteCourant(String numeroCompte, String titulaire,double solde, double decouvertAutorise) {
        super(numeroCompte, titulaire,solde);  
        this.decouvertAutorise = decouvertAutorise;  
    }

   
    public double getDecouvertAutorise() {
        return decouvertAutorise;
    }

    @Override
    public void retirer(double montant) {
        if (this.getSolde() - montant >= -decouvertAutorise) {
            this.setSolde(this.getSolde() - montant);  
            System.out.println("Retrait de " + montant + " € effectué avec succès.");
        } else {
            System.out.println("Retrait refusé. Vous avez dépassé le découvert autorisé de " + decouvertAutorise + " €.");
        }
    }
}

