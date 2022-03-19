class Solution {
public:
    vector<int> plusOne(vector<int>& digits) {
        int i, c = 1, sum = 0;
        vector<int> res;
        
        for(i=digits.size()-1;i>=0;i--)
        {
            sum = digits[i] + c;
            c = sum / 10;
            res.push_back(sum % 10);
        }
        if(c)
            res.push_back(1);
        reverse(res.begin(), res.end());
        return res;
    }
};