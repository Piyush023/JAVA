package Basics.Pratice_Ques;

import java.util.Scanner;

public class AP_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();  // Start
        int n = sc.nextInt();  // Number
        int d = sc.nextInt();  // Difference
        int nThTerm = a+(n-1)*d;

        System.out.println(nThTerm);
    }
}
