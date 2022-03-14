class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        unordered_set<char> subStr;
        int prevCount=0;
        
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
                if(subStr.find(s[j]) == subStr.end())
                    subStr.insert(s[j]);
                else
                    break;
            }
            if(prevCount < subStr.size())
                    prevCount = subStr.size();    
            subStr.clear();
        }
        
        if(prevCount < subStr.size())
            return subStr.size();
        else
            return prevCount;
    }
};