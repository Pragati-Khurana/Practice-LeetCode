class Solution {
    public String reverseWords(String s) {
        String word="";
        Stack<String> stack1 = new Stack<String>();
        char ch[] = s.toCharArray();

        for(int i=0;i<ch.length;i++) {
            if(ch[i]==' ') {
                if(word!="")
                    stack1.push(word);
                word="";
            } else
                word=word+ch[i];
        }

        if(word!="")
            stack1.push(word);

        word="";
        while(!stack1.empty()) {
            word=word + stack1.pop();
            if(stack1.size()>0)
                word=word+" ";
        }
        return word;
    }
}