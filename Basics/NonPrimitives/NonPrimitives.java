package Basics.NonPrimitives;

class Point {
    int x;
    int y;
}
public class NonPrimitives {
    public static void main(String[] args) {
        Point a = new Point();
        a.x = 10;
        a.y = 20;
        System.out.print(a.x+" "+ a.y);
    }
}
