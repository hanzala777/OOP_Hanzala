package com.OOP.Abstraction;

//Abstraction: Reduce complexity by unnecessary details
//Coupling: The level of dependency between classes
public class Main {
    public static void main(String[] args) {
        Employee1 employee = new Employee1();
        employee.setBaseSalary(50_000);
        employee.setHourlyRate(20);
        int wage = employee.calculateWage(10);
        System.out.println(wage);
    }
}
