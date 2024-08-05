package Basics.Auto_And_Un_Boxing;

public class Auto_And_Un_Boxing {
    public static void main(String[] args) {
        int x1 = 10;
        Integer x2 = x1; // AutoBoxing
        int x3 = x2; // AutoUn-Boxing
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
    }
}
