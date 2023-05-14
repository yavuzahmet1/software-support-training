package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Fibonacci how many series get? ");
        int series = scanner.nextInt();

        int firstNumber = 0, lastNumber = 1;
        System.out.print(firstNumber + " " + lastNumber);

        for(int i = 2; i < series; i++) {
            int nextIssue = firstNumber + lastNumber;
            System.out.print(" " + lastNumber);
            firstNumber = lastNumber;
            lastNumber = nextIssue;
        }
    }
}