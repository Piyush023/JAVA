package DSA.Tree;

public class Traversal {
    // BFS - Inorder - Printing the Whole one level at one time and then going to the next level.

    // DFS - Left Subtree before Right subtree.
    // 1. InOrder - (Left, Root, Right) - 20, 10, 30
    // 2. PreOrder - (Root, Left, Right) - 10, 20, 30
    // 3. PostOrder - (Left, Right, Root) - 20, 30, 10

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);

//        BFS - Check this One again.
        int height = height(root);
        levelOrder(root,height);

//        DFS -

//        1. Inorder -
        System.out.println("<<<<< InOrder >>>>>>");
        inOrder(root);

//        2. PreOrder -
        System.out.println("<<<<< PreOrder >>>>>>");
        preOrder(root);

//        3. PostOrder -
        System.out.println("<<<<< PostOrder >>>>>>");
        postOrder(root);
    }

    public static int height(Node root){
        if(root==null){
            return 0;
        }
        else{
            return Math.max(height(root.left), height(root.right))+1;
        }
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

    public static void levelOrder(Node root, int height){
        if(root!=null){
            NodeAtDistK(root, height);
//            System.out.println(root.key);
//            NodeAtDistK(root.right);
        }
    }

    public static void inOrder(Node root){
        if(root!=null){
            inOrder(root.left);
            System.out.println(root.key);
            inOrder(root.right);
        }
    }

    public static void preOrder(Node root){
        if(root!=null){
            System.out.println(root.key);
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public static void postOrder(Node root){
        if(root!=null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.key);
        }
    }
}
