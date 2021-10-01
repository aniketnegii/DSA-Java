package com.aniket;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        sieveOfEra(n);
    }

    static void sieveOfEra(int n){
        boolean[] prime = new boolean[n+1];
        for(int i=0;i<=n;i++)
            prime[i] = true;

        for(int p = 2; p*p <=n; p++)
        {
            // If prime[p] is not changed, then it is a prime
            if(prime[p])
            {
                // Update all multiples of p
                for(int i = p*p; i <= n; i += p)
                    prime[i] = false;
            }
        }

        // Print all prime numbers
        int ans = 0;
        for(int i = 2; i <= n; i++)
        {
            if(prime[i])
                ans += i;
                System.out.print(i + " ");
        }
        System.out.println(" ");
        System.out.println(ans);
    }
}
