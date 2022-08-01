class Solution {
    public boolean searchMatrix(int[][] m, int target) {
        int rows=m.length;
        int cols=m[0].length;
        int l, h, mid;
        
        for(int i=0;i<rows;i++) {
            l=0;
            h=cols-1;
            while(l<=h) {
                mid = h+(l-h)/2;
                if(target == m[i][mid])
                    return true;
                else if(target > m[i][mid])
                    l = mid+1;
                else if(target < m[i][mid])
                    h = mid-1;
            }
        }
        return false;
    }
}