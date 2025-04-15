
import java.util.ArrayList;
import java.util.List;

public class PostOrderTreeTraversal {

    public static void postOrder(TreeNode root, List<Integer> l) {
        if (root == null) {
            return;
        }

        postOrder(root.left, l);
        postOrder(root.right, l);
        l.add(root.val);
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        postOrder(root, l);
        return l;

    }

}
