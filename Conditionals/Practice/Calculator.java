package Conditionals.Practice;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int op = sc.nextInt();
        calc(a,b,op);
    }

    public static void calc(int a, int b, int c) {
        switch (c){
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            default:
                System.out.println("Wrong Input - No Operation");
                break;
        }
    }
}
