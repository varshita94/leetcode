/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int height(TreeNode root)
    {
        if(root == null) return 0;
        int l = height (root.left);
        int r = height(root.right);
        return 1+ Math.max(l,r);  //return theheight of the tree
    }

    public void treeOrder(int level , TreeNode root,List<Integer> res)
    {
        if(root == null) return ;

         if(level == 1)
         {
            res.add(root.val);
         }
         else
         {
        
         treeOrder(level-1,root.left,res);
         treeOrder(level-1,root.right,res);
           

         }
    
        
    }


    public List<List<Integer>> levelOrder(TreeNode root) {
        int n = height(root);
        List<List<Integer>> level_order = new ArrayList<>();
        for(int i =1 ;i<=n;i++)
        {
            List<Integer> list = new ArrayList<>();
            treeOrder(i,root,list);
            level_order.add(list);
        }
return level_order;
    }
}