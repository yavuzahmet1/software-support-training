package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double pearPrice = 2.14;
        double applePrice = 3.67;
        double tomatoPrice = 1.11;
        double bananaPrice = 0.95;
        double eggplantPrice = 5.00;

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many kilograms of pear : ");
        double pearKg = scanner.nextDouble();

        System.out.print("How many kilograms of apple : ");
        double appleKg = scanner.nextDouble();

        System.out.print("How many kilograms of tomato : ");
        double tomatoKg = scanner.nextDouble();

        System.out.print("How many kilograms of banana : ");
        double bananaKg = scanner.nextDouble();

        System.out.print("How many kilograms of eggplant : ");
        double eggplantKg = scanner.nextDouble();

        double totalAmount = pearKg * pearPrice +
                appleKg * applePrice +
                tomatoKg * tomatoPrice +
                bananaKg * bananaPrice +
                eggplantKg * eggplantPrice;

        System.out.println("Total amount : " + totalAmount + "TL");
    }
}