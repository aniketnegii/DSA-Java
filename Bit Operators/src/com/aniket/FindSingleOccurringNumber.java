package com.aniket;

public class FindSingleOccurringNumber {
    public static void main(String[] args) {
        int[] arr = {2,2,1,4,1,4,6,8,9,8,9,6,5};
        System.out.println(findSingleOccurrence(arr));
    }

    private static int findSingleOccurrence(int[] arr) {
        int ans = 0;
        for (int ele : arr){
            ans ^= ele;
        }
        return ans;
    }
}
