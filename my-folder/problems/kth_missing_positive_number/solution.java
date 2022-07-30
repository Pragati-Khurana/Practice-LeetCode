class Solution {
    public int findKthPositive(int[] arr, int k) {
        ArrayList<Integer> al = new ArrayList<>();
        int i=1, count=0, j=0;
        
        while(count < k) {
            if(j>=arr.length ||arr[j] != i) {
                al.add(i);
                count++;
            }
            else
                j++;
            i++;
        }
        return al.get(k-1);
    }
}