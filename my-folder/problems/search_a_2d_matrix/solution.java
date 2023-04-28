class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int l = 0;
        int h = (m*n)-1;

        while(l<=h) {
            int mid = l + (h-l)/2;
            System.out.println(matrix[mid/n][mid%n]);
            if(matrix[mid/n][mid%n] == target) {
                System.out.println(matrix[mid/n][mid%n]);
                return true;
            }
            else if(target > matrix[mid/n][mid%n])
                l = mid+1;
            else
                h = mid-1;
        }
        return false;
    }
}