package org.campus02.recap;

public class WarenkorbDemo {

    public static void main(String[] args) {
//        Artikel test = new Artikel(1, "test", 1.00);
//        System.out.println(test);
//        Warenkorb testWarenkorb = new Warenkorb();
//        testWarenkorb.addArtikel(test);

        Artikel apfel = new Artikel(1, "Apfel", 0.50);
        Artikel paprika = new Artikel(2, "Paprika", 1);
        Artikel apfel2 = new Artikel(1, "Apfel", 0.50);

        Warenkorb warenkorb = new Warenkorb();
        warenkorb.addArtikel(apfel);
        warenkorb.addArtikel(paprika);
        warenkorb.addArtikel(apfel2);

        warenkorb.printArtikel();
        System.out.println(warenkorb.calculateSum());
    }
}
