class Solution {
    public void rotate(int[][] mat) {
        int r = mat.length;
        int c = mat[0].length;
        int i, j, temp;
        
        //transpose
        for(i=0;i<r;i++) {
            for(j=i;j<c;j++) {
                temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        
        for(i=0;i<r;i++) {
            reverseRow(i, 0, c-1, mat);
        }
    }
    
    public static void reverseRow(int r, int s, int e, int[][] mat) {
        while(s<e) {
            int temp = mat[r][s];
            mat[r][s] = mat[r][e];
            mat[r][e] = temp;
            s++;
            e--;
        }
    }
}