package com.aniket;

import java.util.Scanner;

public class cellingnum {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }

        int target = in.nextInt();

        int ans = cellingbs(arr, target);
        System.out.println("Answer is " + arr[ans]);
    }

    static int cellingbs(int[] nums, int k){
        int start =0;
        int end = nums.length-1;
        while (start < end){
            int mid = start + (end - start)/2;
            if(nums[mid] == k) return mid;
            if( nums[mid] > k){
                end = mid;
            }
            else{
                start = mid+1;
            }
        }

        return start;
    }
}
