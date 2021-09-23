package com.aniket;

public class RotationCountOfArray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        int ans;
        int rotatedPoint = findRotation(nums);
        if( rotatedPoint == -1){
            ans = 0;
        } else{
            ans = rotatedPoint + 1;
        }

        System.out.println("Element fount at: "+ ans);
    }

    static int findRotation(int[] arr){
        int start = 0, end = arr.length-1, mid;
        while( start <= end){
            mid = start + (end - start)/2;
            if( mid < end && arr[mid] > arr[mid + 1]) return mid;
            else if( mid > start &&  arr[mid]< arr[mid-1] ) return mid-1;
            else{
                if(arr[start] < arr[mid]) start = mid+1;
                else end = mid - 1;
            }
        }
        return -1;
    }
}
