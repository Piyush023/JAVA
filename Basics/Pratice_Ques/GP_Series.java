package Basics.Pratice_Ques;

import java.util.Scanner;

public class GP_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();  // Start
        int r = sc.nextInt();  // Number
        int n = sc.nextInt();  // Difference
        double nThTerm = (double)(a * (double)(Math.pow(r,(n-1))));

        System.out.println(nThTerm);
    }
}
