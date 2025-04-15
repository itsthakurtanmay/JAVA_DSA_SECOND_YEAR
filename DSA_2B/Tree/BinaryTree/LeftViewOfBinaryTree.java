
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LeftViewOfBinaryTree {

    ArrayList<Integer> leftView(Node root) {

        // code here
        ArrayList<Integer> al = new ArrayList<>();
        if (root == null) {
            return al;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int n = q.size();
            ArrayList<Integer> currList = new ArrayList<>();
            while (n != 0) {
                Node front = q.poll();
                currList.add(front.data);
                if (front.left != null) {
                    q.add(front.left);
                }
                if (front.right != null) {
                    q.add(front.right);
                }
                n--;
            }
            // System.out.println(currList);
            int ele = currList.get(0);
            al.add(ele);
        }
        return al;
    }

}
