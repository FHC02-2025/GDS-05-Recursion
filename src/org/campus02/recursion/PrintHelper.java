package org.campus02.recursion;

public class PrintHelper {

    public static void main(String[] args) {
        printFromNToZero(3);
        printFromNToZeroRecursive(4);
        System.out.println("From Zero to N");
        printFromZeroToNRecursive(3);
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

    // rekursiv
    public static void printFromNToZeroRecursive(int n) {
        // 1. Abbruchsbestimmung
        if (n < 0) {
            return;
        }
        // 2. Code / Logik
        System.out.println("n = " + n);

        // 3. Selbst nochmals aufrufen -> rekursion
        printFromNToZeroRecursive(n - 1);
    }

    public static void printFromZeroToNRecursive(int n) {
        // 1. Abbruchsbestimmung
        if (n < 0) {
            return;
        }

        // 3. Selbst nochmals aufrufen -> rekursion
        printFromZeroToNRecursive(n - 1);

        // 2. Code / Logik
        System.out.println("n = " + n);
    }
}
