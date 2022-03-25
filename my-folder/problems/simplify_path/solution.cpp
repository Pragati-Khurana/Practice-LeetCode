class Solution {
public:
    string simplifyPath(string path) {
        stack<string> s;
        vector<string> str;
        string temp="";
        
        for(int i=0;i<path.length();i++)
        {
            if(path[i]=='/')
            {
                if(temp!="")
                    str.push_back(temp);
                temp="";
            }
            else
            {
                temp += path[i];
            }
        }
        if(temp!="")
            str.push_back(temp);
        
        int i=0;
        while(i<str.size())
        {
            if(!s.empty() && str[i]=="..")
                s.pop();
            else if(str[i]!="" && str[i]!="." && str[i]!="..")
                s.push(str[i]);
            i++;
        }
        str.clear();
        if(s.empty())
            return "/";
        i = 0;
        while(s.empty()==false)
        {
            str.push_back(s.top());
            s.pop();
            i++;
            str.push_back("/");
            i++;
        }
        reverse(str.begin(), str.end());
    
         i=0;
         temp="";
         while(i<str.size())
         {
             temp = temp + str[i];
             i++;
         }
        
        return temp;
    }
};