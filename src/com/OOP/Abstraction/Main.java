package com.OOP.Abstraction;

//Abstraction: Reduce complexity by unnecessary details
//Coupling: The level of dependency between classes
//Constructor:
public class Main {
    public static void main(String[] args) {
        Employee1 employee = new Employee1(50000,20);
        int wage = employee.calculateWage(10);
        System.out.println(wage);
    }
}
