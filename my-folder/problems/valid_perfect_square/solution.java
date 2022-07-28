class Solution {
    public boolean isPerfectSquare(int num) {
        long l = 1;
        long h = num;
        long mid = 0;
        
        while(l<=h) {
            mid = h + (l - h)/2;
            if(mid*mid == num)
                return true;
            else if(num > mid*mid)
                l = mid + 1;
            else if(num < mid*mid)
                h = mid - 1;
        }
        return false;
    }
}