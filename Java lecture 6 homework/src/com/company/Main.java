package com.company;

public class Main {

    public static void main(String[] args) {
	// PRINT A HOLLOW BUTTERFLY
        /*
        int n= 5;
        for(int i= 1; i<=n; i++){
            for(int j= 1; j<=i; j++){
                if(j==1 || i==j){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            for(int j=1;j<=(n-i)*2;j++){
                System.out.print(" ");
            }

            for(int j= 1; j<=i; j++){
                if(j==1 || i==j){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }


            System.out.println();
        }

        for(int i= n; i>=1; i--){
            for(int j= 1; j<=i; j++){
                if(j==1 || i==j){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            for(int j=1;j<=(n-i)*2;j++){
                System.out.print(" ");
            }

            for(int j= 1; j<=i; j++){
                if(j==1 || i==j){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }


            System.out.println();
        }



        */

        // PRINT A HOLLOW RHOMBUS
        /*
        int n= 9;
        for(int i= 1; i<=n;i++){
            for(int j= 1; j<= (n-i);j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n;j++){
                if(i==1 || j==1 || i==n || j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        */

        // Pascal triangle

        int n = 5;

        //Half pyramid

        int m= 5;

        for(int i=1; i<=m;i++){
            for(int j= 1; j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }















    }
}
