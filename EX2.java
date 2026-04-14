package TP3;

class Rectangle {
	double largeur;
	double longueur;
	
	public Rectangle(double largeur, double longueur) {
		this.largeur=largeur;
		this.longueur=longueur;
	}
	public double surface() {
		return largeur*longueur;
	}
	public double perimetre() {
		return 2 * (longueur + largeur);
	}
}
public class EX2 {
	public static void main(String[] args) {
		Rectangle R1 = new Rectangle(3.0,5.0);
		System.out.println("La surface de rectangle est " + R1.surface());
		System.out.println("Le perimetre de rectabgle est " + R1.perimetre());
	}
}
