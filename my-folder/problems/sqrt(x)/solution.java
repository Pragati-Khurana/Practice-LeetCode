class Solution {
    public int mySqrt(int x) {
        long l = 1;
        long h = x;
        long mid=0;
        long ans=0;
        while(l<=h) {
            mid = h + (l - h)/2;
            if(mid*mid == x)
                return (int)mid;
            else if(x > mid*mid){
                l = mid + 1 ;
                ans=mid;
            }
            else if(x < mid*mid) {
                h = mid - 1;
            }
        }
        return (int)ans;
    }
}