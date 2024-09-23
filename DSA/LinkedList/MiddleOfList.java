package DSA.LinkedList;

public class MiddleOfList {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        middleOfList(head);
    }
    public static void middleOfList(Node head){
        // This is based on the Slow and Fast Pointer Approach -
        if(head == null){
            return;
        }
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
    }
}
