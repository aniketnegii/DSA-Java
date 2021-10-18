package com.aniket;

public class EvenOdd {
    public static void main(String[] args) {
        int n = 76;
        System.out.println(checkOdd(n));
    }

    static boolean checkOdd(int n){
        return (n & 1) == 1;
    }
}
