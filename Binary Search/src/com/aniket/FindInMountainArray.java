package com.aniket;
//https://leetcode.com/problems/find-in-mountain-array/
public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 5;
        int ans = search(arr, target);
        System.out.println("Element at index: "+ ans);
    }

    static int search(int[] arr, int target){
        int peak = findPeak(arr);
        int ans1 = ordAgnosticBS(arr, target, 0, peak);
        if( ans1 != -1) return ans1;
        else {
            int ans2 = ordAgnosticBS(arr, target, peak+1, arr.length-1);
            if( ans2 != -1) return ans2;
            else return -1;
        }
    }

    static int findPeak(int[] arr){
        int start = 0, end = arr.length - 1, mid;
        while( start < end ){
            mid = start + (end - start)/2;
            if( arr[mid] < arr[mid+1] ) start = mid + 1;
            else end = mid;
        }
        return start;
    }

    static int ordAgnosticBS(int[] arr, int target, int start, int end){
        boolean isAsc = arr[start] < arr[end];
        int mid;
        while( start <= end){
            mid = start + (end - start) / 2;
            if(arr[mid] == target) return mid;
            if(isAsc){
                if(arr[mid] > target) end = mid - 1;
                else start = mid + 1;
            }
            else{
                if(arr[mid] < target) end = mid - 1;
                else start = mid + 1;
            }
        }
        return -1;
    }
}
