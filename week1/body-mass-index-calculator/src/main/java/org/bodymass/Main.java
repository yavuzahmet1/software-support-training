package org.bodymass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double kg, m, bmi;

        System.out.println("Please enter your height in meters (for example: 1,75) : ");
        m = scanner.nextDouble();

        System.out.println("Please enter your weight : ");
        kg = scanner.nextDouble();

        bmi = kg / (m * m);
        System.out.println("Body mass index : " + bmi);
    }
}