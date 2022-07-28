class Solution {
    public boolean isValid(String str) {
        char ch[] = str.toCharArray();
        
        Stack<Character> s = new Stack<>();
        boolean res=false;
        
        for(int i=0;i<ch.length;i++) {
            if(ch[i]=='(' || ch[i]=='{' || ch[i]=='[') {
                s.push(ch[i]);
            }
            else {
                
                char p;
                if(!s.isEmpty())
                    p = s.pop();
                else
                    return false;
                
                if(p=='(' && ch[i]==')')
                    res=true;
                else if(p=='{' && ch[i]=='}')
                    res=true;
                else if(p=='[' && ch[i]==']')
                    res=true;
                else {
                    res = false;
                    break;
                }
            }
        }
        
        if(!s.isEmpty())
            res = false;
        return res;
    }
}