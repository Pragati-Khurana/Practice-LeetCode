class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int rows = mat.length;
        int cols = mat[0].length;
        int ans[] = new int[rows];
        int finalAns[] = new int[rows];
        int FA[] = new int[k];
        
        for(int i=0;i<rows;i++) {
            if(mat[i][cols-1]==1) {
                ans[i] = cols;
                continue;
            }
            
            int l=0, h=cols-1, mid;
            ans[i] = 0;
            while(l<=h) {
                mid = h+(l-h)/2;
                if(mat[i][mid]==1) {
                    if(mat[i][mid+1]==0) {
                        ans[i] = cols-((cols-mid)-1);
                        break;
                    }
                    else
                        l = mid + 1;
                }
                else
                    h = mid - 1;
            }
        }
        
        for(int i=0;i<rows;i++)
            finalAns[i] = i;
        
        for(int i=0;i<rows-1;i++) {
            for(int j=i+1;j<rows;j++) {
                if(ans[i]>=ans[j]) {
                    
                    
                    if((ans[i]==ans[j] && finalAns[i]>finalAns[j]) || ans[i]!=ans[j]) {
                        int temp2 = finalAns[i];
                        finalAns[i] = finalAns[j];
                        finalAns[j] = temp2;    
                    }
                    int temp = ans[i];
                    ans[i] = ans[j];
                    ans[j] = temp;
                    
                }
            }
        }
        
        for(int i=0;i<k;i++)
            FA[i] = finalAns[i];
        
        return FA;
    }
}