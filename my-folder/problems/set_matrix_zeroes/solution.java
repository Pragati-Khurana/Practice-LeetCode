class Solution {
    public void setZeroes(int[][] mat) {
        int r=mat.length, c=mat[0].length;
        List<Integer> li = new ArrayList<>();
        List<Integer> lj = new ArrayList<>();
        
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                if(mat[i][j]==0) {
                    li.add(i);
                    lj.add(j);
                }
            }
        }
        int k=0;
        while(k<li.size()) {
            changeRow(mat, 0, li.get(k), c);
            changeColumn(mat, 0, lj.get(k), r);
            k++;
        }
    }
    
    public static void changeRow(int[][] mat, int idx, int r, int cols) {
        if(idx == cols)
            return;
        
        mat[r][idx] = 0;
        changeRow(mat, idx+1, r, cols);
    }
    
    public static void changeColumn(int[][] mat, int idx, int c, int rows) {
        if(idx == rows)
            return;
        
        mat[idx][c] = 0;
        changeColumn(mat, idx+1, c, rows);
    }
}