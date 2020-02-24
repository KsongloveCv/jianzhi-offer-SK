public class Solution {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        /*
        1、寻找相同的根节点
     */
        if(root1==null||root2==null)
            return false;
        if(root1.val==root2.val && isContain(root1,root2))
            return true;
        return HasSubtree(root1.left,root2)||HasSubtree(root1.right,root2);
    }
    /*
        2、比较是否包含
     */
    public boolean isContain(TreeNode node1,TreeNode node2) {
        //我为空，你不为空，说明我不包含你
        if(node1==null&&node2!=null)
            return false;
        //咱两都空，等于值相同
        if(node2==null)
            return true;
        return node1.val==node2.val && isContain(node1.left,node2.left) && isContain(node1.right,node2.right);

    }
}
