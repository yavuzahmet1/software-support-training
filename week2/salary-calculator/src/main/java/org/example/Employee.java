package org.example;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    public String toString(){
        return "Adı : " + name + "\nMaaşı : " + salary + "\nwork hour : " + workHours +
                "\nBaşlangıç yılı : " + hireYear + "\nVergi : " + tax() + "\nBonus : " + bonus() +
                "\nMaaş Artışı : " + raiseSalary() + "\nVergi ve Bonuslar ile birlikte maaş : " + (salary+bonus()-tax()) +
                "\nToplam Maaş : " + (salary + raiseSalary());
    }
    

    double tax(){
        if(salary > 1000){
            return salary * 0.03;
        }
        return 0;
    }

    double bonus(){
        if(workHours > 40){

            return (workHours - 40) * 30;
        }
        return 0;
    }

    double raiseSalary(){
        hireYear = 2023 - hireYear;
        if(hireYear < 10){
            return salary * 0.05;
        }
        if(hireYear > 9 && hireYear < 20){
            return salary * 0.10;
        }
        if(hireYear > 19){
            return salary * 0.15;
        }
        return 0;
    }
}
