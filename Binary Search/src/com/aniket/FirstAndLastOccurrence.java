package com.aniket;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class FirstAndLastOccurrence {
    public static void main( String[] args){
        int[] nums = {5,7,7,7,7,7,8,8,10};
        int target = 7;
        int[] res = findOccurrence(nums, target);
        System.out.println("Index of occurrence: " + res[0] + " " + res[1] );
    }

    static int[] findOccurrence(int[] arr, int target){

        int[] ans = {-1, -1};
        int first = binarySearchModified(arr, target, true);
        int last = binarySearchModified(arr, target, false);
        ans[0] = first;
        ans[1] = last;
        return ans;
    }

    static int binarySearchModified(int[] arr, int target, boolean findStart){
        int start = 0, end = arr.length - 1, mid, ans = -1;
        while( start <= end){
            mid = start + (end-start)/2;
            if(arr[mid] == target) {
                ans = mid;
                if(findStart){
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            } else if( arr[mid] > target){
                end = mid -1;
            } else {
                start = mid+1;
            }
        }
        return ans;
    }
}
