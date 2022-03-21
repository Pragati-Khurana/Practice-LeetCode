class Solution {
public:
    int singleNumber(vector<int>& nums) {
       
        int res, i;
        unordered_map<int, int> m;
        for(i=0;i<nums.size();i++)
        {
            if (m.find(nums[i]) == m.end())
            {
                m[nums[i]] = 1;
            }
            else
            {
                for (auto j : m)
                {
                    if(j.first == nums[i])
                    {
                        m[j.first]++;   
                        break;
                    }
                }
            }
            
        }
        
        for (auto j : m)
        {
            if(j.second==1)
            {
                res = j.first;
                break;
            }
        }
        
        return res;
    }
};