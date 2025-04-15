
import java.util.LinkedList;
import java.util.Queue;

public class SumOfBinaryTree {

    static int sumBT(Node root) {
        // Your code here
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int sum = 0;
        while (!q.isEmpty()) {
            Node temp = q.poll();
            sum += temp.data;
            if (temp.left != null) {
                q.add(temp.left);
            }
            if (temp.right != null) {
                q.add(temp.right);
            }
        }
        return sum;
    }
}
