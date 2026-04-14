package TP3;

class NombreComplexe {
    double reel;
    double imag;

    public NombreComplexe(double r, double i) {
        this.reel = r;
        this.imag = i;
    }

    public NombreComplexe addition(NombreComplexe n) {
        return new NombreComplexe(
            this.reel + n.reel,
            this.imag + n.imag
        );
    }

    public NombreComplexe multiplication(NombreComplexe n) {
        double r = this.reel * n.reel - this.imag * n.imag;
        double i = this.reel * n.imag + this.imag * n.reel;
        return new NombreComplexe(r, i);
    }

    public void afficher() {
        System.out.println(reel + " + " + imag + "i");
    }
}

public class EX4 {
    public static void main(String[] args) {
        NombreComplexe n1 = new NombreComplexe(2, 3);
        NombreComplexe n2 = new NombreComplexe(1, 4);
        NombreComplexe somme = n1.addition(n2);
        NombreComplexe produit = n1.multiplication(n2);
        System.out.print("Somme: ");
        somme.afficher();
        System.out.print("Produit: ");
        produit.afficher();
    }
}
