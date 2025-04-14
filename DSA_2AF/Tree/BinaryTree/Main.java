
import java.util.*;

class Node {

    int data;
    Node left;
    Node right;
    //constructor;

    public Node(int ch) {
        this.data = ch;
        this.left = null;
        this.right = null;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //User se input lene ke liye;
        System.out.println("Enter the root node value");
        int x = sc.nextInt();
        Node root = new Node(x);

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node temp = q.poll();
            System.out.println("Enter the left child Node");
            int l = sc.nextInt();
            if (l != -1) {
                Node newnode = new Node(l);
                q.add(newnode);
            }
            System.out.println("Enter the right child Node");
            int r = sc.nextInt();
            if (r != -1) {
                Node newnode = new Node(r);
                q.add(newnode);
            }
        }

    }
}
