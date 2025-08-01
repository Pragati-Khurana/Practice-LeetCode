/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l = 1, h = n, mid=0,ans=0;
        
        while(l <= h) {
            mid = h + (l - h)/2;
            if(isBadVersion(mid)==true) {
                ans=mid;
                h = mid - 1;
            }
            else
                l = mid + 1;
        }
        return ans;
    }
}