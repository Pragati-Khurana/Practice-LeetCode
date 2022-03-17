class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        string res="";
        int i=1, k=0, l=0, flag=0;;
        
        l = strs[0].length();
        while(i<strs.size())
        {
            if(strs[i].length()<l)
                l = strs[i].length();
            i++;
        }
        k = 0;
        
        while(k<l)
        {
            i=1;
            flag=0;
            while(i<strs.size())
            {
                if(strs[i][k]!=strs[0][k])
                    flag=1;
                i++;    
            }
            if(flag==0)
                res = res + strs[0][k];
            else if(flag==1)
                break;
            k++;
        }
        return res;
    }
};