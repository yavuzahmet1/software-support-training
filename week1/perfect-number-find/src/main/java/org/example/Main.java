package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int number,total=0;
        System.out.print("Enter number : ");
        number=scanner.nextInt();
        for(int i=1;i<number;i++){
            if(number%i==0){
                total=total+i;
            }
        }if(total==number){
            System.out.println(number+" is perfect number.");
        }else {
            System.out.println(number+" is not perfect number.");
        }
    }
}