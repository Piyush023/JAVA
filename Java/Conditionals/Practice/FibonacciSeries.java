package Java.Conditionals.Practice;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibSeries(n);
    }
    private static void fibSeries(int n){
        if(n==0){
            System.out.println(1);
        }
        else if(n==1){
            System.out.print(1 + " ");
            System.out.print(1);
        }else{
            System.out.print(1 + " ");
            System.out.print(1 + " ");
            int a = 1, b = 1;
            for(int i=2; i<=n;i++){
                int c = a+b;
                System.out.print(c + " ");
                a = b; // This is to update the numbers to get the value of the previous numbers.
                b = c; // This is to update the numbers to get the value of the previous numbers.
            }
        }
    }
}
