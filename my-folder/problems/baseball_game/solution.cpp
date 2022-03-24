class Solution {
public:
    int calPoints(vector<string>& ops) {
        
        stack<int> s;
        for(int i=0;i<ops.size();i++)
        {
            if(ops[i]=="+")
            {
                int x1 = s.top();
                s.pop();
                int x2 = s.top();
                int sum = x1+x2;
                s.push(x1);
                s.push(sum);
            }
            else if(ops[i]=="D")
            {
                s.push(s.top()*2);
            }
            else if(ops[i]=="C")
            {
                s.pop();
            }
            else
            {
                int ia = stoi(ops[i]);
                s.push(ia); 
            }
        }
        int sum = 0;
        while(!s.empty())
        {
            cout<<s.top()<<endl;
            sum = sum + s.top();
            s.pop();
        }
        
        return sum;
    }
};