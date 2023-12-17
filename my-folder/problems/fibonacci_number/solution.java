class Solution {
    public int fib(int n) {
        int f0 = 0;
        int f1 = 1;
        int f2 = f0 + f1;

        if(n==0) return f0;
        if(n==1) return f1;
        
        int i=2;
        while(i<n) {
            f0 = f1;
            f1 = f2;
            f2 = f0 + f1;
            i++;
        }
        return f2;
    }
}