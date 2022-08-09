class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0, j=0, k=0;
        int res[] = new int[nums1.length];
        
        while(i<m && j<n) {
            if(nums1[i] < nums2[j]) {
                res[k] = nums1[i];
                i++;
            }
            else {
                res[k] = nums2[j];
                j++;
            }
            k++;
        }
        
        while(i<m) {
            res[k] = nums1[i];
            i++;
            k++;
        }
        
        while(j<n) {
            res[k] = nums2[j];
            j++;
            k++;
        }
        
        i=0;
        while(i<nums1.length) {
            nums1[i] = res[i];
            i++;
        }
    }
}