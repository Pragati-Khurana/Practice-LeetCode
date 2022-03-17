class Solution {
public:
    int strStr(string haystack, string needle) {
        
        int i=0, res=0;
        int hl = haystack.length();
        int nl = needle.length();
        
        if(nl==0)
            return res;
        
        res = -1;
        
        if(nl>hl)
            return res;
        
        while(i<hl)
        {
            if(haystack[i]==needle[0])
            {
                if(i+(nl-1) < hl)
                {
                    res = i;
                    int j=1;
                    int i2 = i+1;
                    while(j<nl && i2<hl)
                    {
                        if(haystack[i2]==needle[j])
                        {
                            j++;
                            i2++;
                        }
                        else
                        {
                            res = -1;
                            break;
                        }
                    }
                }
            }
            if(res != -1)
                break;
            i++;
        }
        return res;
    }
};