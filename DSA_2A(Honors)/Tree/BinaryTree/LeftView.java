
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LeftView {

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
            ArrayList<Integer> l = new ArrayList<>();
            while (n != 0) {
                Node temp = q.poll();
                l.add(temp.data);
                if (temp.left != null) {
                    q.add(temp.left);
                }
                if (temp.right != null) {
                    q.add(temp.right);
                }
                n--;
            }
            al.add(l.get(0));
        }
        return al;
    }

}
