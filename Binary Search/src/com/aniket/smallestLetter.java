package com.aniket;

import java.util.Scanner;

//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class smallestLetter {
    public static void main(String[] args) {

        char[] letters = {'c','f','j'};
        char target = 'a';
        System.out.println("Character at " + bssmallletter(letters, target));

    }
    static char bssmallletter(char[] letters, int target){
        int start = 0, end = letters.length, mid;
        while(start < end){
            mid = start + (end-start) / 2;
            if( letters[mid] > target ){
                end = mid;
            } else {
                start = mid+1;
            }
        }

        return (letters[start % letters.length]);
    }
}
