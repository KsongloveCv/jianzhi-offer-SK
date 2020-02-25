public class Solution {
        ArrayList<ArrayList<Integer>> alist=new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list=new ArrayList<Integer>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        
        //判断边界
        if(root==null)
            return alist;
        list.add(root.val);
        if(root.val==target&&root.left==null&&root.right==null)
            alist.add(new ArrayList<Integer>(list));
        if(root.val<=target&&root.left!=null) {
            FindPath(root.left,target-root.val);
        }
        if(root.val<=target&&root.right!=null) {
            FindPath(root.right,target-root.val);
        }
        list.remove(list.size()-1);
        return alist;
        
    }
}
