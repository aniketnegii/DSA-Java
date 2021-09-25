package com.aniket;
//https://leetcode.com/problems/split-array-largest-sum/
public class SplitArrayLargestSum {
    public static void main(String[] args) {
        //int[] nums = {7,2,5,10,8};
        int[] nums = {1,2,3,4,5};
        int m = 2;
        int ans = splitArray(nums, m);
        System.out.println("Answer: "+ ans);
    }

    static int splitArray(int[] arr, int m){
        int start = arr[0], end = 0, mid;
        for(int num: arr){
            start = Math.max(start, num);
            end += num;
        }

        while( start < end ){
            mid = start + (end - start)/2;
            int pieces = countPieces(arr, mid);
            if( pieces > m ) start = mid + 1;
            else end = mid;
        }
        return end;
    }

    static int countPieces(int[] arr, int mid){
        int sum = 0, count=1;
        for(int num: arr){
            if( sum + num > mid){
                count++;
                sum = num;
            }
            else{
                sum+=num;
            }
        }
        return count;
    }
}
