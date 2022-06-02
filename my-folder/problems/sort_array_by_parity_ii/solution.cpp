class Solution {
public:
    vector<int> sortArrayByParityII(vector<int>& nums) {
        int i, j=0, k=1;
        int s = nums.size();
        
        while(j<s && k<s)
        {
            if(nums[j]%2==0)
                j=j+2;
            else if(nums[k]%2!=0)
                k=k+2;
            else
                swap(nums[j],nums[k]);
        }
        return nums;
    }
};