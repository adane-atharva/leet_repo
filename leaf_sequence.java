/*Problem Statement : 
 * Consider all the leaves of a binary tree, from left to right order, the values of those leaves form a leaf value sequence.
 * Two binary trees are considered leaf-similar if their leaf value sequence is the same.

Return true if and only if the two given trees with head nodes root1 and root2 are leaf-similar.
 */




/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {

    ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<Integer> list2 = new ArrayList<>();
    

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {

        parseTree(root1,list1);
        parseTree(root2,list2);

        if (list1.equals(list2))
        {
            return true;
        }
        else{
        return false;
        }

    }

    private void parseTree(TreeNode root, ArrayList<Integer> al) {
        
        if (root.left == null && root.right == null) {
            al.add(root.val);
        } else {
            if(root.left!=null)
                parseTree(root.left, al);
            if(root.right!=null)
                parseTree(root.right, al);
        }

    }
}