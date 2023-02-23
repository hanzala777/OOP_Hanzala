package com.OOP.ControlFlow;

import java.text.NumberFormat;
import java.util.Scanner;
//Mortgage calculator (Monthly payments)
public class Main {
    public static void main(String[] args) {

        //initializing
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        int principal=0;
        float annualInterest=0;
        float monthlyInterest=0;
        byte years=0;
        int numberOfPayments=0;

        Scanner sc = new Scanner(System.in);

        //defining correctly
        while(true) {
            System.out.println("Principal: ");
            principal = sc.nextInt();
            if(principal>=1000 && principal<=1_000_000)
                break;
            System.out.println("Enter a value between 1000 and 1000000.");
        }

        while (true) {
            System.out.println("Annual interest Rate: ");
            annualInterest = sc.nextFloat();
            if (annualInterest >= 1 && annualInterest <= 30){
                monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
            break;
            }
            System.out.println("Enter a value between 1 and 30.");
        }

        while (true) {
            System.out.println("Period(Years):");
            years = sc.nextByte();
            if(years>=1 && years<=30){
                numberOfPayments = years * MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value between 1 and 30.");
        }

        //Applying logic
        double mortgage = principal*
                (monthlyInterest*Math.pow(1+monthlyInterest,numberOfPayments)
                /(Math.pow(1+monthlyInterest,numberOfPayments)-1));

        //Changing mortgage to currency format
        String mortgageFormatted= NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Your monthly payment is: "+mortgageFormatted);
    }
}
//it's to complex to understand and not looks too good so let's do OOP