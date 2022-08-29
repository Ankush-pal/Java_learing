package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       /* System.out.println("Enter first value");
        int a = sc.nextInt();
        System.out.println("Enter Second value");
        int b = sc.nextInt();
        System.out.println("""
                Input '1' for addition\s
                Input '2' for Subtraction\s
                Input '3' for Multiplication\s
                Input '4' for Division\s
                Input '5' for Modulo""");
        byte button = sc.nextByte();
        /*
        switch (button){
            case 1 : System.out.println(a+b);
            break;
            case 2 : System.out.println(a-b);
            break;
            case 3 : System.out.println(a*b);
            break;
            case 4 : System.out.println(a/b);
            break;
            case 5 : System.out.println(a%b);
            break;
            default : System.out.println("Invalid Input");
        }

        switch (button) {
            case 1:
                int Addition = a + b;
                System.out.println("Addition = " + Addition);
                break;
            case 2:
                int Subtraction = a - b;
                System.out.println("Subtraction = " + Subtraction);
                break;
            case 3:
                int Multiplication = a * b;
                System.out.println("Multiplication = " + Multiplication);
                break;
            case 4:
                int Division = a / b;
                System.out.println("Division = " + Division);
                break;
            case 5:
                int Modulo = a % b;
                System.out.println("Modulo = " + Modulo);
                break;
            default:
                System.out.println("Invalid Input");
        } */

        // month identifier

        int number = sc.nextInt();
        if(number == 1){
            System.out.println("January");
        } else if (number == 2){
            System.out.println("February");
        } else if (number == 3){
            System.out.println( "March");
        } else if (number == 4){
            System.out.println("April");
        } else if (number == 5){
            System.out.println("May");
        } else if (number == 6){
            System.out.println("June");
        } else if(number == 7){
            System.out.println("July");
        } else if(number == 8){
            System.out.println("August");
        } else if(number == 9){
            System.out.println("September");
        } else if(number == 10){
            System.out.println("October");
        } else if(number == 11){
            System.out.println("November");
        } else if(number == 12){
            System.out.println("December");
        } else {
            System.out.println("Out of actual values (1~12)");
        }


    }
}
