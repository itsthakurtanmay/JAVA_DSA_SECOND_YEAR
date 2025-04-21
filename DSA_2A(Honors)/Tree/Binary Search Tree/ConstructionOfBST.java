
import java.util.LinkedList;
import java.util.Queue;

class TreeNode {

    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class ConstructionOfBST {

    //(BFS-Constructtion)
    public static TreeNode insertBST(TreeNode root, int val) {
        TreeNode newNode = new TreeNode(val);

        if (root == null) {
            return newNode;
        }

        TreeNode current = root;

        while (true) {
            if (val < current.val) {
                if (current.left == null) {
                    current.left = newNode;
                    break;
                } else {
                    current = current.left;
                }
            } else {
                if (current.right == null) {
                    current.right = newNode;
                    break;
                } else {
                    current = current.right;
                }
            }
        }

        return root;
    }

    // Build BST from level order array using iteration
    public static TreeNode buildBST(int[] levelOrder) {
        TreeNode root = null;
        for (int val : levelOrder) {
            root = insertBST(root, val);
        }
        return root;
    }

    // BST printing - (By level order traversal)
    public static void printLevelOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            System.out.print(current.val + " ");

            if (current.left != null) {
                queue.offer(current.left);
            }

            if (current.right != null) {
                queue.offer(current.right);
            }
        }
    }

    public static void main(String[] args) {
        int[] levelOrder = {10, 5, 15, 3, 7, 12, 18};

        TreeNode root = buildBST(levelOrder);

        System.out.print("Level Order Traversal of BST: ");
        printLevelOrder(root);
    }
}
