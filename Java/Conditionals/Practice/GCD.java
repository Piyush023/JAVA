package Java.Conditionals.Practice;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i = 1;
        int gcd = 0;
        while(i <= Math.min(a,b)){
            if(a%i==0 && b% i==0){
                gcd = i;
            }
            i++;
        }
        System.out.println(gcd+" is the GCD of "+ a +" & "+ b);
    }
}
