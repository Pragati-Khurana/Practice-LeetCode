class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> m = new HashMap<>();
        Stack<Integer> s = new Stack<>();
        int[] res = new int[nums1.length];

        for(int i=nums2.length-1;i>=0;i--) {
            while(s.empty()==false && s.peek()<nums2[i])
                s.pop();
            if(s.empty()==false)
                m.put(nums2[i], s.peek());
            else
                m.put(nums2[i], -1);

            s.push(nums2[i]);
        }

        for(int i=0;i<nums1.length;i++) {
            res[i] = m.get(nums1[i]);
        }
        return res;
    }
}