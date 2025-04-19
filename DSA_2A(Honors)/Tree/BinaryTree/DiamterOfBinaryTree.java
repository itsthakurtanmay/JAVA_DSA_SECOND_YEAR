
public class DiamterOfBinaryTree {

    // THIS CODE IS CORRECT BUT IT TAKES 0(n^2) time 
    // public static int height(TreeNode root){
    //     //base case;
    //     if(root == null)return 0;
    //     int left = height(root.left);
    //     int right = height(root.right);
    //     int ans = 1 + Math.max(left,right);
    //     return ans;
    // }
    // public int diameterOfBinaryTree(TreeNode root) {
    //     if(root == null)return 0;
    //     int left = diameterOfBinaryTree(root.left);
    //     int right = diameterOfBinaryTree(root.right);
    //     int common = height(root.left) + height(root.right);
    //     int ans = Math.max(left, Math.max(right,common));
    //     return ans;
    // }
    // So,with this single change we convert 0(n^2) to 0(N) time complexity, this is huge OPTIMIZATION;
    private int ans = 0;

    public int height(TreeNode root) {
        //if root==null height==0
        if (root == null) {
            return -1;
        }

        int L = height(root.left);
        int R = height(root.right);
        //ans signfies(no. of nodes farthest apart) or the DIAMETER
        ans = Math.max(ans, L + R + 2);
        //height of the tree is max of LST & RST +1
        return 1 + Math.max(L, R);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        height(root);
        return ans;

    }

}
