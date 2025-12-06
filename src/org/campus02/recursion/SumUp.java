package org.campus02.recursion;

public class SumUp {

    public static void main(String[] args) {
        System.out.println("sumUpIterative(3) = " + sumUpIterative(3));
        System.out.println("sumUpRecursive(3) = " + sumUpRecursive(3));
        System.out.println("sumUpRecursiveAcc(3) = " + sumUpRecursiveAcc(3, 0));
    }

    public static int sumUpIterative(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static int sumUpRecursive(int n) {
        // Abbruchsbestimmung
        if (n <= 0) {
            return n;
        }

        return n + sumUpRecursive(n - 1);
        // 3 + sumUpRecursive(2)
        // 3 + 2 + sumUpRecursive(1)
        // 3 + 2 + 1 + sumUpRecursive(0)
        // 3 + 2 + 1 + 0
        // => 6
    }

    public static int sumUpRecursiveAcc(int n, int acc) {
        if (n <= 0) {
            return acc;
        }
        acc = acc + n;
        return sumUpRecursiveAcc(n - 1, acc);
    }
}
