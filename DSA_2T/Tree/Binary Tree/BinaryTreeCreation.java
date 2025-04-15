
import java.util.*;

class TreeNode {

    int data;
    TreeNode left;
    TreeNode right;

    //constructor -> use to access class ke data member ko;
    public TreeNode(int value) {
        this.data = value;
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
            TreeNode frontEle = q.poll();
            System.out.println(frontEle.data);

            if (frontEle.left != null) {
                q.add(frontEle.left);
            }
            if (frontEle.right != null) {
                q.add(frontEle.right);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the root node data");
        int x = sc.nextInt();
        TreeNode root = new TreeNode(x);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode removed = q.poll();

            System.out.println("Enter the left child if exist");
            int leftChild = sc.nextInt();
            if (leftChild != -1) {
                TreeNode lc = new TreeNode(leftChild);
                removed.left = lc;
                q.add(lc);
            }

            System.out.println("Enter the right child if exist");
            int rightChild = sc.nextInt();
            if (rightChild != -1) {
                TreeNode rc = new TreeNode(rightChild);
                removed.right = rc;
                q.add(rc);
            }
        }

        levelOrderTraversal(root);
    }
}
