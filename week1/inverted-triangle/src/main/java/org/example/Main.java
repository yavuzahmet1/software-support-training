package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of digits : ");
        int numberOfDigits= scanner.nextInt();
        for (int i =numberOfDigits; i >= 1; i--) {
            for (int j = 0; j <numberOfDigits- i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}