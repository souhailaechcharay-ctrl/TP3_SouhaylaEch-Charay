package TP3;

class Produit {
    int id;
    String nom;
    String description;
    double prix;
    int quantite;
    static Produit[] tab = new Produit[10];
    static int compteur = 0;

    public Produit(int id, String nom, String description, double prix, int q) {
        this.id = id;
        this.nom = nom;
        this.description = description;
        this.prix = prix;
        this.quantite = q;
    }

    public static void ajouterProd(Produit p) {
        if(compteur < tab.length) {
            tab[compteur] = p;
            compteur++;
        }
    }
    
    public static void modifierProd(int id, String nouveauNom, String nouvelleDesc, double nouveauPrix, int nouvelleQte) {
        for(int i = 0; i < compteur; i++) {
            if(tab[i].id == id) {
                tab[i].nom = nouveauNom;
                tab[i].description = nouvelleDesc;
                tab[i].prix = nouveauPrix;
                tab[i].quantite = nouvelleQte;
                System.out.println("Produit modifié avec succès !");
                return;
            }
        }
        System.out.println("Produit introuvable !");
    }

    public static void supprimerProd(int id) {
        for(int i = 0; i < compteur; i++) {
            if(tab[i].id == id) {
                for(int j = i; j < compteur - 1; j++) {
                    tab[j] = tab[j+1];
                }
                tab[compteur-1] = null;
                compteur--;
                System.out.println("Produit supprime avec succes");
                return;
            }
        }
        System.out.println("Produit introuvable !");
    }

    public static Produit getProduitByID(int id) {
        for(int i = 0; i < compteur; i++) {
            if(tab[i].id == id)
                return tab[i];
        }
        return null;
    }

    public static void getAllProduit() {
        for(int i = 0; i < compteur; i++) {
            System.out.println(tab[i].id + " - " + tab[i].nom + " - " + tab[i].prix);
        }
    }
}

public class EX7 {
    public static void main(String[] args) {
        Produit p1 = new Produit(1, "PC", "Laptop", 8000, 5);
        Produit p2 = new Produit(2, "Phone", "Smartphone", 3000, 10);
        Produit p3 = new Produit(3, "Tablette", "iPad", 5000, 3);

        Produit.ajouterProd(p1);
        Produit.ajouterProd(p2);
        Produit.ajouterProd(p3);

        System.out.println("Liste initiale");
        Produit.getAllProduit();

        System.out.println("Apres modification du produit ID=1");
        Produit.modifierProd(1, "PC Gaming", "Laptop Gaming", 12000, 2);
        Produit.getAllProduit();

        System.out.println("Apres suppression du produit ID=2");
        Produit.supprimerProd(2);
        Produit.getAllProduit();
    }
}