public class sizeOfbinaryTree {
    public static int getSize(Node node) {
        // code here
        if(node==null){
            return 0;
        }
        int leftSize=getSize(node.left);
        int rightSize=getSize(node.right);
        return leftSize+rightSize+1;
    }
    
}
