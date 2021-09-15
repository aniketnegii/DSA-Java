package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Javaarrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int n =5;
//        int[] arr = new int[n];
//        System.out.println(Arrays.toString(arr));
//        arr[0] = 11;
//        System.out.println(Arrays.toString(arr));

        //2D Arrays

//        int[][] arr = new int [3][3]; //declaration and initialization
//
//        //input
//        for(int i=0; i<arr.length; i++){
//            for(int j=0; j < arr[i].length; j++){
//                arr[i][j] = in.nextInt();
//            }
//        }
//
//        //output
//        for(int i=0; i< arr.length; i++){
//            for(int j=0; j< arr[i].length; j++){
//                System.out.print(arr[i][j]);
//            }
//            System.out.println();
//        }

        //ArrayList
//        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(55);
//        System.out.println(list);

        int[] arr = {10, 12, 15};
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println(max);
    }
}
