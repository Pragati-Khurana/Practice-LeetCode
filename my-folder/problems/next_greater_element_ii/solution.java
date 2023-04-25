class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] ans = new int[nums.length];
        Stack<Integer> s1 = new Stack<>();
        int n = nums.length;
        
        for(int i=2*n-1;i>=0;i--) {
            while(s1.empty()==false && s1.peek()<=nums[i%n])
                s1.pop();
            
            if(i<n) {
                if(!s1.empty())
                    ans[i] = s1.peek();
                else
                    ans[i] = -1;
            }
            
            s1.push(nums[i%n]);
        }
        return ans;
    }
}