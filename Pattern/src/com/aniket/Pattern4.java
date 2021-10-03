package com.aniket;

public class Pattern4 {
    public static void main(String[] args) {
//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5
        // no. of rows = 5
        // for every ith row there are i+1 col
        // every jth element in the ith row print j
        // print (i+j)
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
