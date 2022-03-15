class Solution {
public:
    int reverse(int x) {
        double res=0;
        int finalRes=0;
        while(x!=0)
        {
            res = res * 10 + (x % 10);
            x = x/10;
        }
        if(res < -(pow(2,31)) || res > (pow(2,31)-1))
            res = 0;
        else
            finalRes = (int)res;
        
        return finalRes;
    }
};