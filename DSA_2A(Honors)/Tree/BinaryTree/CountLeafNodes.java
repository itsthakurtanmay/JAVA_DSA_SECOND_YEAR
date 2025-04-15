
public class CountLeafNodes {

    public static void preOrder(int[] count, Node root) {
        //Base case;
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            count[0] = count[0] + 1;
        }
        preOrder(count, root.left);
        preOrder(count, root.right);
    }

    int countLeaves(Node root) {
        // Your code
        int[] count = new int[1];
        preOrder(count, root);
        return count[0];
    }

}
