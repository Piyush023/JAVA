package Conditionals.Practice;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Naive - This is O(n) Time Complex
        // naivePrime(n);

        // Optimized - This is O(n) Time Complex
        // optimizedPrime(n);

        // More Optimized - This is O(n) Time Complex
        moreOptimizedPrime(n);
    }

    public static void naivePrime(int n){
        for(int i=2;i<=n;i++){
            if(n%i == 0 && i != n){
                System.out.println("Not a Prime Number");
                return;
            }
        }
        System.out.println("Prime Number");
    }

    public static void optimizedPrime(int n){
        for(int i=2;i*i<=n;i++){
            if(n%i == 0 && i != n){
                System.out.println("Not a Prime Number");
                return;
            }
        }
        System.out.println("Prime Number");
    }

    public static void moreOptimizedPrime(int n){
        if(n%2==0 || n%3==0){
            System.out.println("Not a Prime Number");
            return;
        }
        for(int i=5;i*i<=n;i = i+6){
            if(n%i == 0 || n%(i+2)==0){
                System.out.println("Not a Prime Number");
                return;
            }
        }
        System.out.println("Prime Number");
    }
}
