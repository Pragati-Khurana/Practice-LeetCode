class Solution {
    public String removeOuterParentheses(String s) {
        int flag=0, count=0;
        String s1="";
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++) {
            if(i%2==0) {
                if(ch[i]=='(') {
                    if(flag==0)
                        flag=1;
                    else {
                        count++;
                        s1=s1+ch[i];
                    }
                }
                else if(ch[i]==')')
                    s1=s1+ch[i];
            }
            else {
                if(ch[i]==')') {
                    if(count>0) {
                        count--;
                        s1=s1+ch[i];
                    }
                    else {
                        flag=0;
                    }
                } else if(ch[i]=='(')
                    s1=s1+ch[i];
            }
        }
        return s1;
    }
}