class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] res = new int[code.length];
        for(int i=0; i<code.length; i++) {
            int dk = k;
            int sum = 0;
            while(dk != 0) {
                sum = sum + code[((i+dk+code.length)%code.length)];
                if(dk>0)
                    dk--;
                else dk++;
            }
            res[i] = sum;
        }
        return res;
    }
}