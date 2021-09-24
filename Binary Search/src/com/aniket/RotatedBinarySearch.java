package com.aniket;
//https://leetcode.com/problems/search-in-rotated-sorted-array/
public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        int ans;
        int rotatedPoint = findRotationPoint(nums);
        if( rotatedPoint == -1){
            ans = binarySearch(nums, target, 0, nums.length-1);
        } else{
            if(nums[rotatedPoint] == target) ans = rotatedPoint;
            else if( target >= nums[0] ) ans = binarySearch(nums, target, 0, rotatedPoint - 1);
            else ans = binarySearch(nums, target, rotatedPoint+1, nums.length -1 );
        }

        System.out.println("Element fount at: "+ ans);
    }

    static int binarySearch(int[] arr, int target, int start, int end){
        int mid;
        while(start <= end){
            mid = start + (end - start)/2;
            if( arr[mid] == target) return mid;
            else if ( arr[mid] > target) end = mid -1;
            else start = mid+1;
        }
        return -1;
    }

    static int findRotationPoint(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        int mid;
        while( start <= end){
            mid = start + (end - start)/2;
            if( mid < end && arr[mid] > arr[mid +1]){
                return mid;
            }
            if( mid>start && arr[mid] < arr[mid -1]){
                return mid-1;
            }
            if( arr[mid] <= arr[start]){
                end = mid - 1;
            } else {
                start = mid+1;
            }
        }
        return -1;
    }

    static int findRotationPointInDuplicate(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        int mid;
        while( start <= end){
            mid = start + (end - start)/2;
            if( mid < end && arr[mid] > arr[mid +1]){
                return mid;
            }
            if( mid>start && arr[mid] < arr[mid -1]){
                return mid-1;
            }
            if( arr[mid] == arr[start] && arr[mid] == arr[end]){
                if(arr[start] > arr[start + 1]){
                    return start;
                }
                start++;
                if( arr[end] < arr[end - 1]){
                    return end;
                }
                end --;
            }
            else if( arr[start] < arr[mid] || (arr[mid] == arr[start] && arr[mid] > arr[end])){
                start = mid+1;
            } else {
                end = mid -1;
            }
        }
        return -1;
    }
}
