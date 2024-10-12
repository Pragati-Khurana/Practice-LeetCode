class Solution {
    public String reverseWords(String s) {
        char ch[] = s.toCharArray();
        Stack<String> st = new Stack<>();
        String word = "";

        for(int i=0; i<ch.length; i++) {
            if(ch[i] == ' ') {
                if(word != "")
                    st.push(word);
                word = "";
            } else
                word = word + ch[i];
        }
        if(word != "")
            st.push(word);

        word = "";

        while(!st.empty()) {
            word = word + st.pop();

            if(st.size()>0)
                word = word + " ";
        }
        return word;
    }
}