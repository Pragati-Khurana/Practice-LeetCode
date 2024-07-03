class Solution {
    public int reverse(int x) {
        double res = 0;
        while(x != 0) {
            res = res*10+(x%10);
            x = x/10;
        }

        if(res < -(Math.pow(2, 31)) || res > (Math.pow(2, 31)-1))
            res = 0;
        
        return (int) res;
    }
}