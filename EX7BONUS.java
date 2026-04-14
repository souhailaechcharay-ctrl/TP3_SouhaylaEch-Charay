package TP3;

import java.util.Scanner;

public class EX7BONUS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nombreSecret = (int)(Math.random() * 10) + 1;
        int tentatives = 0;
        boolean trouve = false;

        System.out.println("Devinez le nombre entre 1 et 10");

        while(!trouve) {
            System.out.print("Votre essai : ");
            int essai = sc.nextInt();
            tentatives++;

            if(essai < nombreSecret) {
                System.out.println("Plus grand !");
            } else if(essai > nombreSecret) {
                System.out.println("Plus petit !");
            } else {
                trouve = true;
                System.out.println("Bravo, Vous avez trouve en " + tentatives + " tentative(s) !");
                if(tentatives == 1) {
                    System.out.println("Score : 100/100 - Parfait !");
                } else if(tentatives <= 3) {
                    System.out.println("Score : 80/100 - Excellent !");
                } else if(tentatives <= 5) {
                    System.out.println("Score : 60/100 - Bien !");
                } else if(tentatives <= 7) {
                    System.out.println("Score : 40/100 - Peut mieux faire !");
                } else {
                    System.out.println("Score : 20/100 - Continuez à vous entrainer !");
                }
            }
        }

        sc.close();
    }
}
