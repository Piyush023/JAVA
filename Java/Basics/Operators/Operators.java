package Java.Basics.Operators;

public class Operators {
    public static void main(String[] args) {
        int x = 10, y = 20;
// Arthematic operators -
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);
        System.out.println(x%y);


// Assignment Operators -
        int z = x;
        System.out.println(z);
        System.out.println(z+=2);
        System.out.println(z-=2);
        System.out.println(z*=29);
        System.out.println(z%=29);

// Logical Operators -
        System.out.println(x==0 && y==1);
        System.out.println(x==0 || y==1);
        System.out.println(x!=20);

//Relational Operators -
        System.out.println(x<y);
        System.out.println(x>y);
        System.out.println(x!=y);
        System.out.println(x>=y);
        System.out.println(x<=y);
        System.out.println(x==y);
    }
}
