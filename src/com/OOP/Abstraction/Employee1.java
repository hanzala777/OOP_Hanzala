package com.OOP.Abstraction;

public class Employee1 {
        private int baseSalary;
        private int hourlyRate;
        public int calculateWage(int extraHours){
        return getBaseSalary()+(getHourlyRate() *extraHours);
    }
        public void setBaseSalary(int baseSalary){
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

        public void setHourlyRate(int hourlyRate) {
        if(hourlyRate<=0)
            throw new IllegalArgumentException("Hourly Rate cannot be Zero");
        this.hourlyRate = hourlyRate;
    }
}
