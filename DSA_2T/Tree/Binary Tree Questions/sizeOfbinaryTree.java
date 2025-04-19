
import java.util.ArrayList;

public class sizeOfbinaryTree {

    //Approach 1 : Size of Binary Tree;
    // public static int getSize(Node node) {
    //     // code here
    //     if (node == null) {
    //         return 0;
    //     }
    //     int leftSize = getSize(node.left);
    //     int rightSize = getSize(node.right);
    //     return leftSize + rightSize + 1;
    // }
    //Approach 2 : Size of Binary tree;
    public static void preOrder(ArrayList<Integer> al, Node root) {
        if (root == null) {
            return;
        }
        al.add(root.data);
        preOrder(al, root.left);
        preOrder(al, root.right);

    }

    public static int getSize(Node node) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        preOrder(al, node);
        return al.size();
    }
}
