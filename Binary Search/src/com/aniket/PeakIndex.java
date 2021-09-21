package com.aniket;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class PeakIndex {
    public static void main( String[] args){
        int[] arr = {24,69,100,99,79,78,67,36,26,19};
        System.out.println("Peak Index: " + findPeak(arr));
    }

    static int findPeak(int[] nums){
        int start = 0, end = nums.length, mid;
        while( start < end){
            mid = start + (end - start)/2;
            if( nums[mid] < nums[mid+1]) start = mid+1;
            else end = mid;
        }

        return start;
    }
}
