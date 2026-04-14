package TP3;

class Voiture {
    String marque;
    int vitesse;

    public Voiture(String marque, int vitesse) {
        this.marque = marque;
        this.vitesse = vitesse;
    }

    public void accelerer(int v) {
        vitesse =vitesse + v;
        if(vitesse > 240)
            vitesse = 240;
    }

    public void freiner(int v) {
        vitesse =vitesse - v;
        if(vitesse < 0)
            vitesse = 0;
    }
}
public class EX6 {
    public static void main(String[] args) {
        Voiture v = new Voiture("BMW", 90);
        v.accelerer(100);
        v.freiner(50);
        System.out.println("Vitesse = " + v.vitesse);
    }
}