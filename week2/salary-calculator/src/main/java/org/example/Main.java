package org.example;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Bilal", 2000,45,1985);
        String print = employee.toString();
        System.out.println(print);
    }
}