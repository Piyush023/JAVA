package Basics.Operators;

public class Bitwise_Operators {
    public static void main(String[] args) {
        int x = 3, y = 6;
//        AND Operator -
        System.out.println(x&y);

//        OR Operator -
        System.out.println(x|y);

//        XOR Operator -
        System.out.println(x^y);

//        NOT Operator -
        System.out.println(~x);
        System.out.println(~y);

//        Left Shift Operator -
        System.out.println(x<<2);
        System.out.println(y<<2);

//        Right Shift Operator -
        System.out.println(x>>2);
        System.out.println(y>>2);

//        Unsigned Right Shift Operator -
        System.out.println(x>>>2);
        System.out.println(y>>>2);
    }
}
