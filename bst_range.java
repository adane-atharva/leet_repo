/* 
 * Problem statement : Given the root node of a binary search 
 * tree and two integers low and high, return the sum of values
 *  of all nodes with a value in the inclusive range 
 * [low, high].
*/

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
    int ans;
    public int rangeSumBST(TreeNode root, int low, int high) {
        ans= 0;
        parse (root, low, high);
        return ans;
    }
    private void parse (TreeNode root, int low, int high)
    {
        if (root== null)
        {
            return;
        }
        if(root.val >= low && root.val <=high)
            ans +=root.val;
        if(root.val>low)
            parse(root.left,low,high);
        if(root.val<high)
            parse(root.right,low,high);
    }
}