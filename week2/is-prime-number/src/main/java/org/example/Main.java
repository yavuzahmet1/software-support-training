package org.example;

import java.util.Scanner;

public class Main {
    public static boolean isPrime(int number, int divisor){
        if (number < 2) {
            return false;
        }
        if (number == 2){
            return true;
        }
        if (number % divisor == 0) {
            return false;
        }
        if (divisor * divisor > number){
            return true;
        }
        return isPrime(number, divisor +1);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number :");
        int sayi = scanner.nextInt();

        if (isPrime(sayi,2)){
            System.out.println(sayi + " is prime.");
        } else {
            System.out.println(sayi + " is not prime.");
        }


    }
}