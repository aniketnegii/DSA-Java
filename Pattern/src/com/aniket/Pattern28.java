package com.aniket;

public class Pattern28 {
    public static void main(String[] args) {
//         *
//        * *
//       * * *
//      * * * *
//     * * * * *
//      * * * *
//       * * *
//        * *
//         *
        int n = 5;
        for( int row = 1; row<= 2*n - 1; row++){
            int c =  row > n ? 2*n - row : row;

            int spaces = n - c;
            for(int s = 1; s<=spaces; s++){
                System.out.print(" ");
            }
            for( int col=1; col<=c; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
