package Java.Conditionals.Practice;

import java.util.Scanner;

public class CountNoOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = 0;
        while(n > 0){
            n = n/10;
            temp = temp + 1;
        }
        System.out.println(temp);
    }
}
