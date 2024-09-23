package DSA.LinkedList;

public class ReverseList {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        reverseList(head);
    }

    public static void reverseList(Node head){
        if(head == null){
            return;
        }
        Node temp = head;
        Node prev = null;
        while(temp != null){
            Node next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }

        while(prev != null){
            System.out.println(prev.data);
            prev = prev.next;
        }

    }
}
