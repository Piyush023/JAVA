package Conditionals.Practice;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int mul = a*b;
        int max = Math.max(a,b);
        int lcm = 0;
        int i = max;
        while(i<=mul){
            if(i%a==0 && i%b==0){
                lcm = i;
                break;
            }
            i++;
        }
        System.out.println(lcm);
    }
}
