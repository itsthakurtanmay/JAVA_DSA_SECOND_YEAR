
import java.util.ArrayList;
import java.util.List;

public class PreOrderTreeTraversal {

    public static void pre(List<Integer> l, TreeNode root) {
        if (root == null) {
            return; //base case;

                }l.add(root.val);
        pre(l, root.left);
        pre(l, root.right);

    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        pre(l, root);
        return l;

    }

}
