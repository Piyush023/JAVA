package Conditionals.Practice;

import java.util.Scanner;

public class Largest3Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        largestOf3Number(a,b,c);
    }

    public static void largestOf3Number(int a, int b, int c) {
        int tempAns = Math.max(a,b);
        int res = Math.max(tempAns, c);
        System.out.println(res+" is the largest Number");
    }
}
