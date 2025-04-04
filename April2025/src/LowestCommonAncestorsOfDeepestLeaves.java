/*
time comeplexity: O(n)
space complexity: O(n)
 */

public class LowestCommonAncestorsOfDeepestLeaves {
    HashMap<Integer,Integer> map = new HashMap<>();
    int maxd=0;
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        depth(root,0);
        return lca(root);

    }
    public TreeNode lca(TreeNode root){
        if(root==null || map.get(root.val)==maxd){
            return root;
        }
        TreeNode lft=lca(root.left);
        TreeNode rgt=lca(root.right);
        if(lft==null){
            return rgt;
        }
        if(rgt==null){
            return lft;
        }
        if(lft!=null && rgt!=null){
            return root;
        }
        return root;
    }
    public void depth(TreeNode root,int d){
        if(root==null){
            return;
        }
        maxd=Math.max(maxd,d);
        map.put(root.val,d);
        depth(root.left,d+1);
        depth(root.right,d+1);

    }
}
