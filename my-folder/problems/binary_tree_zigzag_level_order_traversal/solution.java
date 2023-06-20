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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> l = new LinkedList<List<Integer>>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        int x = 0;

        if(root == null)
            return l;

        q.offer(root);

        while(q.isEmpty() == false) {
            List<Integer> subL = new ArrayList<Integer>();
            int n = q.size();
            
            for(int i=0;i<n;i++) {
                
                if(q.peek().left != null)
                    q.offer(q.peek().left);
                
                if(q.peek().right != null)
                    q.offer(q.peek().right);

                subL.add(q.poll().val);
      
            }
            if(x%2!=0)
                Collections.reverse(subL);
            x++;
            l.add(subL);
        }
        return l;
    }
}