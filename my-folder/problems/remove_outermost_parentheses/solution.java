class Solution {
    public String removeOuterParentheses(String s) {
        int flag=0;
        Stack<Character> st = new Stack<>();
        String res="";

        for(int i=0; i<s.length(); i++) {
            if(flag==0)
                flag=1;
            else if(s.charAt(i) == '(') {
                flag++;
                res = res + s.charAt(i);
            }
            else if(s.charAt(i) == ')' && flag!=1) {
                flag--;
                res = res + s.charAt(i);
            }
            else
                flag--;
        }
        return res;
    }
}