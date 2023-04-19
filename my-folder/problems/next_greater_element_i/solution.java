class Solution {
    public void fillStack(int[] nums2, Stack<Integer> s1) {
        for(int i=0;i<nums2.length;i++) {
            s1.push(nums2[i]);
        }
    }

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> s1 = new Stack<>();
        int[] ans = new int[nums1.length];
         Arrays.fill(ans, -1);
        for(int i=0;i<nums1.length;i++) {
            s1.clear();
            fillStack(nums2, s1);
            int temp = s1.peek();
            while(temp!=nums1[i]) {
                if(temp>nums1[i]) {
                    ans[i] = temp;
                }
                s1.pop();
                temp=s1.peek();
            }
        }
        return ans;
    }
}