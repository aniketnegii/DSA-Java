package com.aniket;

public class Pattern5 {
    public static void main(String[] args) {
//        *
//        **
//        ***
//        ****
//        *****
//        ****
//        ***
//        **
//        *
        //no. of rows = 9 outer loop will run 9 times
        //for each ith col till i/2 + 1 print j++ time after i/2 times print j-- time
        //print *
        int n = 5;
        for( int row = 1; row<= 2*n - 1; row++){
            int c =  row > n ? 2*n - row : row;
            for( int col=1; col<=c; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
