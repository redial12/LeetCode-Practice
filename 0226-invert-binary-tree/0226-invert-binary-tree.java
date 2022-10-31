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
    public TreeNode invertTree(TreeNode root) {
        //once you get to parent of two leaf nodes, swap the references for left and right
        invertRecursively(root);
        return root;
    }
    
    private static void invertRecursively(TreeNode t){
        
        if(t == null){
            return;
        }
        
        TreeNode temp = t.left;
        t.left = t.right;
        t.right = temp;
        
        invertRecursively(t.left);
        invertRecursively(t.right);
        
    }
}