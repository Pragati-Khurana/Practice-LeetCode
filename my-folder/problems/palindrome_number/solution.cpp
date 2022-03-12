class Solution {
public:
    bool isPalindrome(int x) {
        int n = x;
        long revNum = 0;
        while(n>0)
        {
            revNum = revNum * 10 + (n%10);
            n = n/10;
        }
        if(x==revNum)
            return true;
        else return false;
    }
};