package com.aniket;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);

        int size;
        System.out.print("Enter the size of array: ");
        size = in.nextInt();

        int [] arr = new int[size];
        System.out.println("Enter sorted array:");
        for(int i=0; i<size; i++) arr[i] = in.nextInt();

        System.out.println("Enter the element to be searched:");
        int target = in.nextInt();

        int ans = binarySearch(arr, target);
        System.out.println(ans);
        if(ans == -1){
            System.out.println("Element not found.");
        }else{
            System.out.println("Element fount at index " + ans);
        }
    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            //int mid = (start + end) /2;
            int mid = start + (end - start) /2;
            if(arr[mid] == target) {
                return mid;
            }
            else if (target > arr[mid]){
                start = mid+1;
            }
            else if (target < arr[mid]){
                end = mid - 1;
            }
        }

        return -1;
    }
}
