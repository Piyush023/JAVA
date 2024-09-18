package Java.Basics.Conversions;

public class Conversions {
    public static void main(String[] args) {
        // Implicit Conversion -
        int a = 10;
        double d = a; // This is fine as the double value is larger than the int value. (Widening Conversion)

        System.out.println(a+" "+d);

        // Explicit Conversion -
        double x = 65.4954;
        int b = (int)x; // Here we are defining the int with the d so that it represent the int conversion of the Explicit Type.

        char c = (char)b;
        System.out.println(x+" "+b+" "+c);
    }
}
