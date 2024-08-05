package Basics.Input;

import java.io.*;
import java.util.*;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        float f = sc.nextFloat();
        sc.nextLine();
        String s = sc.nextLine();

        System.out.println(a +" "+ f +" "+ s);
    }
}
