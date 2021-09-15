package com.aniket;

public class Linearsearch {

    public static void main(String[] args) {
	// write your code here
        int[] arr = {1,2,5,8,10,15,18,22,25,3};
        int key = 15;
//        int ans = linearSearch(arr, key);
//        if(ans > 0){
//            System.out.println("Element found at index " + ans);
//        } else{
//            System.out.println("Element not found.");
//        }
//
        int a = searchInRange(arr, 2, 5, 8);
        if(a > 0){
            System.out.println("Element found at index "+ a  );
        } else{
            System.out.println("Element not found.");
        }
    }

    static int linearSearch(int[] arr, int key ){
        if(arr.length == 0){
            return -1;
        }

        for(int i=0; i<arr.length; i++) {
            if (arr[i] == key) return i;
        }
        return -1;
    }

    static int searchInRange(int[] nums, int start, int end, int key){
        if(nums.length == 0) return -1;
        if(start>end) return -1;

        for(int i = start; i<=end; i++){
            if(nums[i] == key){
                return i;
            }
        }

        return -1;
    }
}
