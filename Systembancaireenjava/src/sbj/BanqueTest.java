package sbj;


public class BanqueTest {
	public static void main(String[] args) {
        Banque banque = new Banque(10);
        CompteBancaire compte1=new CompteBancaire("1111","oumnia",2000);
        CompteBancaire compte2=new CompteBancaire("2222","rihame",3000);
        CompteBancaire compte3=new CompteBancaire("3333","manal",100);

        banque.ajouterCompte(compte1);
        banque.ajouterCompte(compte2);
        banque.ajouterCompte(compte3);
        compte1.deposer(500);
        compte2.retirer(500);
        banque.transfert("oumnia", "rihame", 500);
        System.out.println("le compte de oumnia  "+compte1.getSolde());
        System.out.println("le compte de rihame "+compte2.getSolde());
        System.out.println("le compte de manal  "+compte3.getSolde());
        Banque.afficherNombreComptes();
        CompteCourant compteCourant1 = new CompteCourant("111111", "salim", 500.0, 200.0);
        CompteCourant compteCourant2 = new CompteCourant("226778", "younes", 1000.0, 300.0);
        CompteEpargne compteEpargne1 = new CompteEpargne("3334636", "imad", 1500.0, 2.0);
        CompteEpargne compteEpargne2 = new CompteEpargne("4235647", "soukayna", 2000.0, 3.0);
        banque.ajouterCompte(compteCourant1);
        banque.ajouterCompte(compteCourant2);
        banque.ajouterCompte(compteEpargne1);
        banque.ajouterCompte(compteEpargne2);
        compteCourant1.deposer(200.0);
        compteEpargne1.deposer(300.0);
        compteCourant2.retirer(500.0);
        compteEpargne2.retirer(100.0);
        compteEpargne1.calculerInteret();
        compteEpargne2.calculerInteret();
        System.out.println("Solde final du compte courant 1 : " + compteCourant1.getSolde());
        System.out.println("Solde final du compte courant 2 : " + compteCourant2.getSolde());
        System.out.println("Solde final du compte épargne 1 : " + compteEpargne1.getSolde());
        System.out.println("Solde final du compte épargne 2 : " + compteEpargne2.getSolde());

}
}




