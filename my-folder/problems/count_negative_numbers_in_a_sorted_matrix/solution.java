class Solution {
    public int countNegatives(int[][] grid) {
        int rows=grid.length,ans=0,cols=grid[0].length;
        for(int i=0;i<rows;i++){
            if(grid[i][0]<0){
                ans+=cols;
                continue;
            }
            if(grid[i][cols-1]>0){
                continue;
            }
            int start=0,end=cols-1;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(grid[i][mid]<0){
                    if(grid[i][mid-1]<0)
                        end = mid - 1;
                    else {
                        ans += cols - mid;
                        break;
                    }
                }
                else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}