class Solution {
    public boolean isValid(String s) {
        Stack<Character> s1 = new Stack<>();
        char ch[] = s.toCharArray();
        boolean res=false;

        for(int i=0;i<ch.length;i++) {
            if(ch[i]=='(' || ch[i]=='[' || ch[i]=='{')
                s1.push(ch[i]);
            else {
                if(!s1.empty()) {
                    char pop = s1.pop();
                    if(ch[i]==')' && pop=='(')
                        res = true;
                    else if(ch[i]==']' && pop=='[')
                        res = true;
                    else if(ch[i]=='}' && pop=='{')
                        res = true;
                    else {
                        res = false;
                        break;
                    }
                }  else {
                    res = false;
                    break;
                }
            }
        }
        if(!s1.empty())
            res = false;
        return res;
    }
}