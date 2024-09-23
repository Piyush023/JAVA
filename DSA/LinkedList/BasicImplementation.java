package DSA.LinkedList;

class Node{
    int data;
    Node next;
    Node(int x){
        data = x;
        next = null;
    }
}

public class BasicImplementation {
    public static void main(String[] args) {
//        This will form a LinkedList with 3 Element - 1 Head and 2 Child.
        Node head = new Node(10);
        Node c1 = new Node(20);
        Node c2 = new Node(30);
        head.next = c1;
        c1.next = c2;
    }
}
