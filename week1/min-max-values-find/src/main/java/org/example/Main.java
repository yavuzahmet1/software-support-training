package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int limit=0,smallNumber=0,bigNumber=0,number=0,count=1,temp;
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers will you enter? : ");
        limit= scanner.nextInt();

        System.out.print(count+". number is entered : ");
        number= scanner.nextInt();
        smallNumber=number;
        bigNumber=number;

        while (count<limit){
            count+=1;
            System.out.print(count+". number is entered : ");
            number=scanner.nextInt();

            if (number<=smallNumber){
                smallNumber=number;
            }else if (number>bigNumber){
                bigNumber=number;
            }

        }
        System.out.println("Max number : "+ bigNumber);
        System.out.println("Min number : " + smallNumber);
    }
}