package Conditionals.If_Else;

import java.util.Scanner;

public class If_Else {
    public static void main(String[] args) {
        checkEvenOdd();
    }
    public static void checkEvenOdd(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>0){
            System.out.print("Positive ");
            if(n%2==0){
                System.out.print("Even");
            }
            else {
                System.out.print("Odd");
            }
        }
        else if(n<0){
            System.out.print("Negative ");
            if(n%2==0){
                System.out.print("Even");
            }
            else {
                System.out.print("Odd");
            }
        }else{
            System.out.println("Zero");
        }
    }
}
