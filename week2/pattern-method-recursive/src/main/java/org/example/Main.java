package org.example;

import java.util.Scanner;

public class Main {
    static void pattern(int a){
        System.out.print(a + " ");
        if (a<=0){
            return;
        }
        pattern(a - 5);
        System.out.print(a + " ");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("N number : ");
        int n = scanner.nextInt();
        System.out.print("Result : ");

        pattern(n);
    }
}