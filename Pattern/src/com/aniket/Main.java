package com.aniket;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        Step 1 : no. of lines  = nu. of rows = no. of times outer loop will run.
        Step 2 : Identify for every row no.
                    1. how many cols are there
                    2. types of elements in col
        Step 3 : What do you need to print
        */
//        1.  *****
//            *****
//            *****
//            *****
//            *****
        for(int i = 1; i<=5; i++){
            for(int j=1; j<=5; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
