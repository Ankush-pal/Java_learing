package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {


	// Print all even numbers till n.
       Scanner sc = new Scanner(System.in);
      /*  int n = sc.nextInt();
        int i = 0;
        while (i<=n){
              //  i=i+2;
                System.out.println(i);
                i= i+2;


        }

        //

        for(int i =0;;int i<=10; i++) {
            System.out.println("Apna College");
        } */

        //  Make a menu driven program. The user can enter 2 numbers, either 1 or 0.
        //If the user enters 1 then keep taking input from the user for a student’s marks(out of 100).
        //If they enter 0 then stop.
        //If he/ she scores :
        //Marks >=90 -> print “This is Good”
        //89 >= Marks >= 60 -> print “This is also Good”
        //59 >= Marks >= 0 -> print “This is Good as well”
      /* System.out.println("Enter your choice out of '1' or '2' ??");
       int choice = sc.nextByte();
       if(choice == 1)
        do{
            //System.out.println("Enter your choice out of '1' or '2' ??");
            //int choice = sc.nextByte();
            System.out.println("Enter your marks out of 100");
            int marks = sc.nextInt();
            if(marks >= 90){
                System.out.println("This is Good");
            } else if(marks >=60 && marks <= 80){
                System.out.println("This is Good as well");
            } else if (marks <= 59 && marks >= 0){
                System.out.println("This is Good as well");
            }
            choice = 0;
            int choice = sc.nextByte();

        } while (choice == 1); */
        boolean isPrime = true;

        int n = sc.nextInt();
        for(int i=2; i< n/2 ; i++){
            if(n%i == 0){
                isPrime = false;
                break;
            }
        }

        if(isPrime){
            if(n==1){
                System.out.println("neither prime nor composite");
            } else {
                System.out.println("prime");
            }
        } else {
            System.out.println(" Not prime");
        }



    }
}
