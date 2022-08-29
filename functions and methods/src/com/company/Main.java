package com.company;
import java.util.*;
public class Main {


    public static int multiplyTwoNumbers(int a, int b){
        return a*b;
    }

    public static void printFactorial(int m ){
        if (m<0){
            System.out.println("Invalid Number");
            return;
        }
        int factorial = 1;

        for (int i =m; i>=1; i--){
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return;

    }

    public static boolean ifPrimeOrNot( int value){
        if (value == 0){
            return false;
        }
        for(int i = 1; i<= value/2 ; i++){
            if(value % i == 0){
                return false;

            }
        }
        return true;
    }



    public static void main(String[] args) {

       /* Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = multiplyTwoNumbers(a,b);
        System.out.println(result); */

        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();

        ifPrimeOrNot(q);


    }
}
