package com.OOP.Abstraction;

//Abstraction: Reduce complexity by unnecessary details
//Coupling: The level of dependency between classes
//Constructor:
//Method and constructor Overloading
public class Main {
    public static void main(String[] args) {
        Employee1 employee = new Employee1(50000);
        int wage = employee.calculateWage();
        System.out.println(wage);
    }
}
