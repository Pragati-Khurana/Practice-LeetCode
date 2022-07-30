class Solution {
    public int arrangeCoins(int n) {
        long l=1, h=n, res=0, mid;
        
        while(l<=h) {
            mid = h + (l-h)/2;
            res = mid * (mid + 1)/2;
            if(n == res)
                return (int)mid;
            else if(n > res)
                l = mid + 1;
            else
                h = mid - 1;
        }
        return (int)h;
    }
}