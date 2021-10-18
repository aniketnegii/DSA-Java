package com.aniket;

public class FindSingleOccuringNumber {
    public static void main(String[] args) {
        int[] arr = {2,2,1,4,1,4,6,8,9,8,9,6,5};
        System.out.println(findSingleOccurence(arr));
    }

    private static int findSingleOccurence(int[] arr) {
        int ans = 0;
        for (int ele : arr){
            ans ^= ele;
        }
        return ans;
    }
}
