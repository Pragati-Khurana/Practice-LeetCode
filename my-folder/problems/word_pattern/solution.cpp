class Solution {
public:
    bool wordPattern(string pattern, string s) {
       
        vector<char> p;
        vector<string> s1;
        vector<string> s2;
        string temp="";
        int i=0, j=0;
       bool res=true;
        
        while(j<s.length())
        {        
            if(s[j]!=' ')
            {
                temp += s[j];
                j++;
            }
            else
            {
               if (std::find(s1.begin(), s1.end(), temp) == s1.end())
                {
                    s1.push_back(temp); 
                }
                s2.push_back(temp); 
                temp="";
                j++;           
            }           
        }
        s2.push_back(temp); 
        
        while(i<pattern.length())
        {
            if(s2.size()!=pattern.length())
            {
                res = false;
                break;
            }
            std::vector<char>::iterator itr = std::find(p.begin(), p.end(), pattern[i]);
           
            if (itr != p.cend())
            {
                int index = std::distance(p.begin(), itr);
                
                if(s1[index]==s2[i])
                    res=true;
                else
                {
                    res=false;
                    break;
                }
            }
            else
            {
                int k=0;
                int flag=0;
                while(k<i)
                {
                    if(s2[k]==s2[i])
                    {
                        flag=1;
                        break;
                    }
                    k++;
                }
                if(flag==1)
                {
                    res=false;
                    break;
                }
                else 
                    p.push_back(pattern[i]);
            }
            i++;
        }
        
        return res;
    }
};