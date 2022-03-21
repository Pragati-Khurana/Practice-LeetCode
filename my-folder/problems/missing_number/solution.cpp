class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int res;
        
        for(int i=0;i<=nums.size();i++)
        {
            if(find(nums.begin(), nums.end(), i)==nums.end())
            {
                res = i;
                break;
            }
        }
        return res;
    }
};