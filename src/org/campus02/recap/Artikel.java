package org.campus02.recap;

import java.util.Objects;

public class Artikel {

    private int artId;
    private String name;
    private double price;

    // ALT + EING

    public Artikel(int artId, String name, double price) {
        this.artId = artId;
        this.name = name;
        this.price = price;
    }

    public int getArtId() {
        return artId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Artikel artikel = (Artikel) o;
        return artId == artikel.artId && Double.compare(price, artikel.price) == 0 && Objects.equals(
                name,
                artikel.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(artId, name, price);
    }


    @Override
    public String toString() {
        return "Artikel{" +
                "artId=" + artId +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
