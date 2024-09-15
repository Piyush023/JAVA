package Conditionals.Practice;

import java.util.Scanner;

public class DivisorOfNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Naive - This is O(n) Time Complex
        // naiveDiv(n);

        // Optimized - This is O(Sqrt(n)) Time Complex
        //        optimizedDiv(n);

        // Sorted Optimized - This is O(Sqrt(n)) Time Complex and In Sorted Order
        sortedOptimizedDiv(n);
    }

    public static void naiveDiv(int n) {
        for(int i=1;i<=n;i++){
            if(n % i == 0){
                System.out.println(i);
            }
        }
    }

    public static void optimizedDiv(int n) {
        for(int i=1;i*i<n;i++){
            if(n % i == 0){
                System.out.println(i);
                if(i != n/i){
                    System.out.println(n/i);
                }
            }
        }
    }

    public static void sortedOptimizedDiv(int n) {
        int i;
        for(i=1;i*i<n;i++){ // This loop will run till Square Root of n
            if(n % i == 0){
                System.out.println(i);
            }
        }
        for(;i>=1;i--){ // This loop will run for the values from Square Root of n to n
            if(n%i==0 && i!=n/i+1){
                System.out.println(n/i);
            }
        }
    }
}
