package com.aniket;

import java.util.Arrays;

public class SearchIn2Darray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8,9,10},
                {11,12,14}
        };
        int[] ans = search2Darray(arr, 44);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search2Darray(int[][] nums, int key){
        for(int row=0; row<nums.length; row++){
            for(int col=0; col< nums[row].length; col++){
                if(nums[row][col] == key){
                    return new int[]{row, col};
                }
            }
        }

        return new int[]{-1};
    }
}
