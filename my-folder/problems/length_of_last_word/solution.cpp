class Solution {
public:
    int lengthOfLastWord(string s) {
        int count=0, i=0, res=0;
        while(i<s.length())
        {
            if(s[i]!=' ')
                count++;
            else
            {   
                if(count > 0)
                    res = count;
                
                count = 0;
            }
            
            i++;
        }
        if(count > 0)
            res = count;
        return res;
    }
};