package DSA.LinkedList;

public class LinkedListTraversal {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        printList(head);
    }

    public static void printList(Node head){
        // To Print list - Simply traverse the list till the .next has null in it instead of a reference.
        Node curr = head;
        if(curr == null){
            return;
        }
//        This is printing Iteratively -
//        while(curr != null){
//            System.out.println(curr.data);
//            curr = curr.next;
//        }
        System.out.println(curr.data);
        // This is printing Recursively -
        printList(curr.next);
    }
}
