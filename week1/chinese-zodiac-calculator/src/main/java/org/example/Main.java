package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] zodiacs = { "Monkey", "Rooster", "Dog", "Pig", "Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake","Horse", "Goat" };

        System.out.print("Enter year of birth: ");
        int yearOfBirth = scanner.nextInt();

        System.out.println("Your Chinese Zodiac: " + zodiacs[(yearOfBirth % 12)]);
    }
}