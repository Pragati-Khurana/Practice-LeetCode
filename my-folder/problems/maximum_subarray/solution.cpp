class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        // int n = nums.size(), res = INT_MIN;
        // for(int i=0;i<n;i++)
        // {
        //     int curSum = 0;
        //     for(int j=i;j<n;j++)
        //     {
        //         curSum += nums[j];
        //         res = max(res, curSum);
        //     }
        // }
        // return res;
        
        int ans = nums[0], sum=0;
        
        for(int i=0;i<nums.size();i++)
        {
            sum += nums[i];
            ans = max(sum, ans);
            sum = max(sum, 0);
        }
        return ans;
    }
};