package DSA.Tree;

public class PrintNodeAtDistK {
    public static void main(String[] args) {
        int k = 1;
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);
        NodeAtDistK(root,k);
    }

    public static void NodeAtDistK(Node root, int k) {
        if(root==null){
            return;
        }if(k==0){
            System.out.println(root.key);
        }else{
            NodeAtDistK(root.left,k-1);
            NodeAtDistK(root.right,k-1);
        }
    }
}
