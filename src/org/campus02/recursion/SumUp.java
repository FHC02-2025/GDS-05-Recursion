package org.campus02.recursion;

import java.util.ArrayList;

public class SumUp {

    public static void main(String[] args) {
        System.out.println("sumUpIterative(3) = " + sumUpIterative(3));
        System.out.println("sumUpRecursive(3) = " + sumUpRecursive(3));
        System.out.println("sumUpRecursiveAcc(3) = " + sumUpRecursiveAcc(3, 0));

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("iterativeSum() = " + iterativeSum(numbers));

        System.out.println(numbers);
        System.out.println("recursiveSum(numbers) = " + recursiveSum(new ArrayList<>(numbers)));
        System.out.println(numbers);
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

    public static int iterativeSum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static int recursiveSum(ArrayList<Integer> numbers) {
        if (numbers.size() <= 0) {
            return 0;
        }

        int n = numbers.remove(0);
        return n + recursiveSum(numbers);
    }

    public static int recursiveSumByIndex(ArrayList<Integer> numbers, int index) {
        if (numbers.size() <= index) {
            return 0;
        }
        int n = numbers.get(index);
        return n + recursiveSumByIndex(numbers, index + 1);
    }
}
