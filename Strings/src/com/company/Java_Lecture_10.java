package com.company;

import java.util.*;

public class Java_Lecture_10 {

    public static void main(String []args) {

        Scanner scan = new Scanner(System.in);
        /*System.out.println("Enter the number of name you want to enter");
        int size = scan.nextInt();
        System.out.println("Enter the " + size+ "names");
        String namesArr[]= new String[size];
        for(int i = 0 ; i<namesArr.length ; i++){
            namesArr[i] = scan.nextLine();
        }
        System.out.println("Your input names are :");
        for(int i= 0; i<namesArr.length ; i++){
            System.out.println(namesArr[i]);
        }*/

        // Find the maximum and minimum number in an array of integers.

        int size = scan.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the numbers");
        for(int i= 0; i<size; i++){
            arr[i]= scan.nextInt();
        }

        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;

        for(int i =0; i<size; i++){
            if(arr[i]<minValue){
                minValue = arr[i];
            } else if(arr[i]>maxValue){
                maxValue = arr[i];
            }
        }
        System.out.println("Minimum value found : " + minValue);
        System.out.println("Maximum value found : " + maxValue);
    }
}
