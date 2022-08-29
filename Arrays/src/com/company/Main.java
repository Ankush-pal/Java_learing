package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //definition


        Scanner sc = new Scanner(System.in);
        /*
        boolean weFound = false;
        System.out.println("Enter size of array");
        int sizeArr = sc.nextInt();
        System.out.println("Enter " + sizeArr + " array numbers");

        int[] myArr = new int[sizeArr];

        for(int i = 0; i<sizeArr; i++){
            myArr[i] = sc.nextInt();
        }

        System.out.println("Enter the number you want to show index for");
        int findNumber = sc.nextInt();

        for(int i = 0; i<sizeArr; i++){
            if(myArr[i] == findNumber){
                System.out.println("Index found at : " + i);
                weFound = true;
            }
        }
        if(!weFound){
            System.out.println("Not found");
        }
       // System.out.println("not found");
        */

        //Home work

        // Take array names as input nad print them on screen
        /*int size = sc.nextInt();

        String [] name = new String[size];
        for(int i = 0 ; i < name.length; i++){
            name [i] = sc.next();
        }

        for (int i = 0; i<name.length; i++){
            System.out.println(name[i]);
        }*/

// Question 2 find the min and max number from a list of array
        /*
        int size = sc.nextInt();
        int [] myArr = new int[size];
        for(int i = 0; i<myArr.length; i++){
            myArr[i]= sc.nextInt();
        }
        //System.out.println(Arrays.stream(myArr).max());
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;

        for(int i= 0; i<myArr.length; i++){
            if(myArr[i] < minValue){
                minValue = myArr[i];
            }
            if(myArr[i] > maxValue){
                maxValue = myArr[i];
            }
        }
        System.out.println("Max number is :" + maxValue);
        System.out.println("Min number is :" + minValue);

        */
        int size = sc.nextInt();
        boolean itsorted = false;
        int inputArr [] = new int [size];

        for(int i = 0 ; i<inputArr.length;i++){
            inputArr [i] = sc.nextInt();
        }

        for(int i = 0;i<size-1; i++){
            if(inputArr[i] <= inputArr[i+1]){
                boolean itSorted = true;
            }
        }
        if(itsorted){
            System.out.println("Array is sorted in ascending order");
        } else{
            System.out.println("Array is not sorted in ascending order");
        }









    }
}
