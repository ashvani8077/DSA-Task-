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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer>li=new ArrayList<>();
        recursion(root1, li);
        recursion(root2, li);
        Collections.sort(li);
        return li;
    }

    public static void recursion(TreeNode root,List<Integer>ans){
        if(root==null){
            return;
        }
        recursion(root.left,ans);
        ans.add(root.val);
        recursion(root.right,ans);
    }
}
