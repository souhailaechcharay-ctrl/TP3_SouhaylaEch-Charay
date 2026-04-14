package TP3;

class Etudiant {
    String cne;
    double note;
    public Etudiant(String cne, double note) {
        this.cne = cne;
        this.note = note;
    }
    public boolean estAdmis() {
        return note >= 10;
    }
    public String toString() {
        return "CNE: " + cne + ", Note: " + note;
    }
}
public class EX3 {
	public static void main(String[] args) {
		Etudiant E1 = new Etudiant("M123456789", 16.7);
		System.out.println(E1.estAdmis());
		System.out.println(E1.toString());
	}
}
