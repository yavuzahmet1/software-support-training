package org.airlineticket;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int distance, age, tripType;
        double normalAmount, ageReduction = 0, discountedAmount, roundTripDiscount, totalAmount;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the distance (km) :");
        distance = scanner.nextInt();
        if (distance <= 0) {
            System.out.println("You have entered incorrect data! : ");
        }
        System.out.println("Enter your age : ");
        age = scanner.nextInt();
        if (age <= 0) {
            System.out.println("You have entered incorrect data!");
        }
        System.out.println("Enter trip type (1 => One way , 2 => Round Trip):");
        tripType = scanner.nextInt();
        if (tripType != 1 && tripType != 2) {
            System.out.println("You have entered incorrect data!");
        }
        normalAmount = distance * 0.10;

        if (age < 12) {
            ageReduction = normalAmount * 0.50;
        } else {
            if (age <= 24) {
                ageReduction = normalAmount * 0.10;
            } else {
                if (age > 65) {
                    ageReduction = normalAmount * 0.30;
                } else {
                    ageReduction = 0;
                }
            }
        }

        discountedAmount = normalAmount - ageReduction;
        if (tripType == 2) {
            roundTripDiscount = discountedAmount * 0.20;
        } else {
            roundTripDiscount = 0;
        }
        totalAmount = (discountedAmount - roundTripDiscount) * (tripType == 2 ? 2 : 1);
        System.out.printf("Total Amount=.%.1f TL", totalAmount);
    }
}