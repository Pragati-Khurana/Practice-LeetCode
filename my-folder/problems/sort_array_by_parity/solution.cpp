class Solution {
public:
    vector<int> sortArrayByParity(vector<int>& nums) {
        int i, k=0;
        for(i=0;i<nums.size();i++)
        {
            if(nums[i]%2==0)
            {
                swap(nums[k],nums[i]);
                k++;
            }
        }
        
        return nums;
    }
};