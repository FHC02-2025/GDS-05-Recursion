package org.campus02.recursion;

public class PrintHelper {

    public static void main(String[] args) {
        printFromNToZero(3);
    }

    /**
     * Schreibe alle Zahlen von n bis 0 auf die Konsole
     * @param n
     */
    public static void printFromNToZero(int n) {
        // wenn n == 3 =>
        // sout(3)
        // sout(2)
        // sout(1)
        // sout(0)

        while (n >= 0) { // n kleiner 0 -> abbruchsbedingung
            System.out.println("n = " + n);
            n--;
        }
    }
}
