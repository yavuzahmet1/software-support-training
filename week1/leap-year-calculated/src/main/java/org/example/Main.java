package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year: ");
        year = scanner.nextInt();

        if(year % 4 == 0 && year % 100!=0 || year % 400==0){
            System.out.print(year + " a leap yer.");
        }
        else{
            System.out.println(year + " not a leap year.");
        }
    }
}