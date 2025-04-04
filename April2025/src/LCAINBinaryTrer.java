/*
time complexity: O(n)
space complexity: O(n)
 */

public class LCAINBinaryTrer {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null){
            return null;
        }
        if(root==p || root==q){
            return root;
        }
        TreeNode lft=lowestCommonAncestor(root.left,p,q);
        TreeNode rgt=lowestCommonAncestor(root.right,p,q);

        if(lft!=null && rgt!=null){
            return root;
        }
        if(lft==null){
            return rgt;
        }
        if(rgt==null){
            return lft;
        }
        return root;

    }
}
