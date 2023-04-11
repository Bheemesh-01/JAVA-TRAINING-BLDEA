package com.bldea.encapsulation.pkg1;

import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        System.out.print("Prime factors of " + n + " are: ");

        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
    }
}