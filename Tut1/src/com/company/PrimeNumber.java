package com.company;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        System.out.println(isPrime(n));
    }

    static boolean isPrime(int num){
        for(int i=2; i< num; i++){
            if(num % i == 0){
                return false;
            }
        }

        return true;
    }
}
