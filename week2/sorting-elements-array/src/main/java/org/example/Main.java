package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dİzinin boyutu n :");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        int counter = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(counter + ". Element :");
            arr[i] = scanner.nextInt();
            counter++;
            System.out.println();
        }
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < (arr.length - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));


    }

}