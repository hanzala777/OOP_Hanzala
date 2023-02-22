package com.OOP.Abstraction;

public class Employee1 {
    private int baseSalary;
    private int hourlyRate;
    public Employee1(int baseSalary,int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
    }
    public int calculateWage(int extraHours) {
        return getBaseSalary()+(getHourlyRate() *extraHours);
    }
    //over loading method calculateWage for extra hours= 0...
    public int calculateWage(){
        return baseSalary;
    }

    //Setting getters and setters to private to abstract them and reduce coupling
    private void setBaseSalary(int baseSalary){
        if(baseSalary<=0)
            throw new IllegalArgumentException("Salary cannot be zero or less.");
        this.baseSalary=baseSalary;
    }
    private int getBaseSalary(){
        return baseSalary;
    }

    private int getHourlyRate() {
        return hourlyRate;
    }
    private void setHourlyRate(int hourlyRate) {
        if(hourlyRate<=0)
            throw new IllegalArgumentException("Hourly Rate cannot be Zero");
        this.hourlyRate = hourlyRate;
    }
}
