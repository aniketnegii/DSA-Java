package com.aniket;

public class Pattern3 {
    public static void main(String[] args) {
//        *****
//        ****
//        ***
//        **
//        *

        //no. of rows = 5 therefore, outer loop runs 5 times
        // for ith row there are 5 - i columns (1 type of element)
        // we need to print *

        for(int i=0; i<5; i++){
            for( int j=0; j< 5 - i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
