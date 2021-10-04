package com.aniket;

public class Pattern31 {
    public static void main(String[] args) {
//        4 4 4 4 4 4 4
//        4 3 3 3 3 3 4
//        4 3 2 2 2 3 4
//        4 3 2 1 2 3 4
//        4 3 2 2 2 3 4
//        4 3 3 3 3 3 4
//        4 4 4 4 4 4 4
        int num = 4;
        int n = 2*num-1;
        for(int row = 1; row<= n; row++){
            for( int col = 1; col <= n; col++){
                int atEveryIndex = num - Math.min(Math.min(row, col), Math.min(n-row+1, n-col+1)) + 1;
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }

    }
}
