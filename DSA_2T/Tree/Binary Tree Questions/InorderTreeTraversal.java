
import java.util.ArrayList;
import java.util.List;

public class inorderTreeTraversal {

    public static void inOrder(TreeNode root, List<Integer> l) {
        if (root == null) {
            return;
        }
        inOrder(root.left, l);
        l.add(root.val);
        inOrder(root.right, l);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        inOrder(root, l);
        return l;

    }

}
