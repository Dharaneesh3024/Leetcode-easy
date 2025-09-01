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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res= new ArrayList<>();
        Deque<TreeNode> q=new ArrayDeque<>();
        if(root==null) return res;
        q.offer(root);
        while(!q.isEmpty()){
            List<Integer> al=new ArrayList<>();
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode temp=q.poll();
                al.add(temp.val);
                if(temp.left!=null) q.offer(temp.left);
                if(temp.right!=null) q.offer(temp.right);
            }
            res.add(al.getLast());
        }
        return res;
    }
}