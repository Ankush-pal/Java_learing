package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       /* int sum = 0;
        for(int i=1; i<=n ; i++){
            sum = sum + i;
           // System.out.println(sum);
        }
        System.out.println(sum); */

        int table = 0;
        for(int i = 1; i<=10; i++){
            System.out.println(n + "*" + i +"=" + n*i );
        }


    }
}
