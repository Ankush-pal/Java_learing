package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input_lena = new Scanner(System.in);
       /* int age = input_lena.nextInt();

        if(age > 18) {
            System.out.println("adulthood found");
        }
        else{
            System.out.println("CHotti bacche ho kya");
        }

        int x = input_lena.nextInt();

        if (x%2 == 0){
            System.out.println("That even bro");
        } else{
            System.out.println(" odd chun liya bhai");
        }

        int a = input_lena.nextInt();
        int b = input_lena.nextInt();

        if(a>b){
            System.out.println("a bada hai bhai");
        } else{
            System.out.println("B bada nikal gya ab toh");
        } */

        int button = input_lena.nextInt();
        switch (button){
            case 111 :
                System.out.println("Hello");
                break;
            case 127 : System.out.println("Namaste");
            break;
            case 333 : System.out.println(" nihao");
            //break;
            default : System.out.println("invalid");

        }







    }
}
