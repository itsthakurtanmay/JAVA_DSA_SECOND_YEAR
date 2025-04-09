
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

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

public class CreationOfBinaryTree {

    public static void levelOrdertraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode curr = q.poll();
            System.out.print(curr.data + " ");
            if (curr.left != null) {
                q.add(curr.left);
            }
            if (curr.right != null) {
                q.add(curr.right);
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the root element");
        int x = sc.nextInt();
        TreeNode root = new TreeNode(x);
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            TreeNode currNode = q.poll();
            System.out.println("Enter the value of left child node");
            int leftChild = sc.nextInt();
            if (leftChild != -1) {
                TreeNode l = new TreeNode(leftChild);
                currNode.left = l;
                q.offer(l);
            }
            System.out.println("Enter the value of right child node");
            int rightChild = sc.nextInt();
            if (rightChild != -1) {
                TreeNode r = new TreeNode(rightChild);
                currNode.right = r;
                q.offer(r);
            }
        }
        levelOrdertraversal(root);
    }
}
