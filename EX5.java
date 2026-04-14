package TP3;

class CompteBancaire {
    String numero;
    double solde;

    public CompteBancaire(String numero, double solde) {
        this.numero = numero;
        this.solde = solde;
    }
    public void deposer(double montant) {
        solde =solde + montant;
    }
    public void retirer(double montant) {
        if(montant <= solde)
            solde =solde - montant;
        else
            System.out.println("Solde insuffisant");
    }
    public void transferer(CompteBancaire c, double montant) {
        if(montant <= solde) {
            this.retirer(montant);
            c.deposer(montant);
        }
    }
    public void afficherSolde() {
        System.out.println("Solde = " + solde);
    }
}
public class EX5 {
    public static void main(String[] args) {
        CompteBancaire c1 = new CompteBancaire("001", 1000);
        CompteBancaire c2 = new CompteBancaire("002", 500);
        c1.deposer(200);
        c1.retirer(100);
        c1.transferer(c2, 300);
        System.out.print("Compte 1: ");
        c1.afficherSolde();
        System.out.print("Compte 2: ");
        c2.afficherSolde();
    }
}