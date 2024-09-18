package Java.Conditionals.Practice;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int temp = 1;
        while(i>0){
            temp = temp * i;
            i--;
        }
        System.out.println(temp);
    }
}
