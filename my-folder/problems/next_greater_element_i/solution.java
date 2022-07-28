class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        List<Integer> l = new ArrayList<>();
        int i=0;
        int[] ans = new int[nums1.length];
        while(i<nums2.length) {
            l.add(nums2[i]);
            i++;
        }
        
        i=0;
        while(i<nums1.length) {
            if(l.contains(nums1[i])) {
                int index = l.indexOf(nums1[i]);
                if(index<nums2.length-1) {
                    int k=index+1;
                    while(k<nums2.length) {
                        if(nums2[k]>nums1[i]) {
                            ans[i] = nums2[k];
                            break;
                        }
                        else
                            ans[i] = -1;
                        k++;
                    }
                }
                else
                    ans[i] = -1;
            }
            else
                ans[i] = -1;
            i++;
        }
        
        return ans;
    }
}