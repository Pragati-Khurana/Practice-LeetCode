class Solution {
public:
    bool isPalindrome(string s) {
        string ori="", rev="";
        for(int i=0;i<s.length();i++)
        {
            if((s[i]>='a' && s[i]<='z') || (s[i]>='A' && s[i]<='Z') || (s[i]>='0' && s[i]<='9'))
                ori += tolower(s[i]);
        }
        for(int i=s.length()-1;i>=0;i--)
        {
            if((s[i]>='a' && s[i]<='z') || (s[i]>='A' && s[i]<='Z') || (s[i]>='0' && s[i]<='9'))
                rev += tolower(s[i]);
        }
        if(ori == rev)
            return true;
        else
            return false;
    }
};