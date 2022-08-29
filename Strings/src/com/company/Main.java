package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
    /*    int size = sc.nextInt();
        String array[] = new String[size];
        int totLength = 0;

        for (int i = 0; i < size; i++) {
            array[i] = sc.next();
            totLength += array[i].length();
        }

        System.out.println(totLength);*/


        String original = sc.next();
        String result = "";

        for(int i=0; i<original.length();i++){
            if(original.charAt(i) == 'e'){
                result += 'i';
            } else {
                result += original.charAt(i);
            }
        }
        System.out.println(result);
    }



}
