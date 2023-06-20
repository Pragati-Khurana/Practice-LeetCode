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
    public List<List<Integer>> levelOT(TreeNode node, int x) {
        List<List<Integer>> l = new ArrayList<List<Integer>>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        TreeNode n1 = new TreeNode(101);

        if(node == null)
            return l;
        
        q.offer(node);
        while(q.isEmpty() == false) {
            List<Integer> sl = new ArrayList<Integer>();
            int n = q.size();

            for(int i=0;i<n;i++) {
                if(q.peek().val != 101) {
                    if(q.peek().left != null)
                        q.offer(q.peek().left);
                    else 
                        q.offer(n1);
                    
                    if(q.peek().right != null)
                        q.offer(q.peek().right);
                    else
                        q.offer(n1);
                }
                

                sl.add(q.poll().val);
            }
            if(x==1)
                Collections.reverse(sl);
            l.add(sl);
        }
        return l;
    }

    public boolean isSymmetric(TreeNode root) {
        List<List<Integer>> l1 = levelOT(root.left, 0);
        List<List<Integer>> l2 = levelOT(root.right, 1);

        if(l1.equals(l2))
            return true;
        return false;
    }
}