package com.aniket;
//You cannot use the length function of Arrays
public class SearchInInfiniteArray {
    public static void main(String[] args) {
        int[] nums = {5,6,7,10,12,15,16,19,20};
        int target = 7;
        int ans = findNum(nums, target);
        System.out.println(ans);
    }

    static int findNum(int[] arr, int target){
        //start with chunk of size 2;
        int start = 0;
        int end = 1;

        //condition for target being in range
        while(target > arr[end]){
            int newStart = end+1;
            //double the chunk value
            end = end + 2*(end - start + 1);
            start = newStart;
        }

        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end){
        while( start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] > target) end = mid - 1;
            else start = mid + 1;
        }
        return -1;
    }
}
