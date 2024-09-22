package Java.Strings.Basic;

public class Basic {
    public static void main(String[] args) {
        String str1 = "HelloWorld";
        String str2 = new String("HelloWorld");
        System.out.println(str1.length());
        System.out.println(str1.charAt(2));
        System.out.println(str1.substring(1)); // Will give the String from index 1 to the last index.
        System.out.println(str1.substring(1,4)); // Will give the String from index 1 to the 3rd index (4-1).
        System.out.println(str1.equals(str2));
        System.out.println(str1.concat(str2));

    }
}
