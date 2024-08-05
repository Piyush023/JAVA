package Basics.Outputs;

public class Output {
    public static void main(String[] args) {
        int x = 10, y = 20;
        String s = "Hello World";
        System.out.println(x);
        System.out.println(y);
        System.out.println(x+y);
        System.out.println(s);

// Format Printing -
        double f = 3.1423141;
        System.out.format("Value of f is %f \n", f);
// Escape Sequence -
        System.out.println("C:\\abc.txt\\xyz.txt");
    }
}
