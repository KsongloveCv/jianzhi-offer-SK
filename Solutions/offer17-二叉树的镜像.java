public class Solution {
    public void Mirror(TreeNode root) {
        /*思路：左右结点互换*/
        if(root!=null){
            if(root.left!=null || root.right!=null){
                TreeNode temp=root.left;
                root.left=root.right;
                root.right=temp;
                Mirror(root.left);
                Mirror(root.right);
            }
        }
        
    }
}
