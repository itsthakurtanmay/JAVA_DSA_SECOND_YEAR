
import java.util.*;

class TreeNode {

    int data;
    TreeNode left;
    TreeNode right;

    //constructor;
    public TreeNode(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTreeCreation {

    public static void levelOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode temp = q.poll();
            System.out.print(temp.data + " ");
            if (temp.left != null) {
                q.add(temp.left);
            }
            if (temp.right != null) {
                q.add(temp.right);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the root node value");
        int rootVal = sc.nextInt();
        TreeNode root = new TreeNode(rootVal);

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            TreeNode temp = q.poll();
            System.out.println("Enter the left child node");
            int leftChild = sc.nextInt();
            if (leftChild != -1) {
                TreeNode lc = new TreeNode(leftChild);
                temp.left = lc;
                q.add(lc);
            }
            System.out.println("Enter the Right child node");
            int rightChild = sc.nextInt();
            if (rightChild != -1) {
                TreeNode rc = new TreeNode(rightChild);
                temp.right = rc;
                q.add(rc);
            }
        }

        levelOrderTraversal(root);
    }
}
