package org.campus02.recap;

import java.util.ArrayList;

public class Warenkorb {

    private ArrayList<Artikel> artikelListe = new ArrayList<>(); // !!!!!!

    // 2. Möglichkeit die Liste (Warenkorb) zu initialisieren
//    public Warenkorb() {
//        artikelListe = new ArrayList<>();
//    }

    // Funktionialität
    public void addArtikel(Artikel artikel) {
        artikelListe.add(artikel);
    }

    public void printArtikel() {
        // alle artikel ausgeben
        for (Artikel a : artikelListe) {
            System.out.println(a);
        }
    }

    public double calculateSum() {
        // hilfsvariable anlegen und initialisieren
        double sum = 0;

        // iter + tab
        for (Artikel artikel : artikelListe) {
            sum += artikel.getPrice();
            //sum = sum + artikel.getPrice();
        }

        return sum;
    }

    public double getHighestPrice() {
        //double highestPrice = 0.0;
        double highestPrice = Double.MIN_VALUE;

        for (Artikel artikel : artikelListe) {
            if (highestPrice < artikel.getPrice()) {
                highestPrice = artikel.getPrice();
            }
        }
        return highestPrice;
    }
}
