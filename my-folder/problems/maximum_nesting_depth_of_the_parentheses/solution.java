class Solution {
    public int maxDepth(String s) {
        char ch[] = s.toCharArray();
        int count=0, max=0;

        for(int i=0;i<ch.length;i++) {
            if(ch[i]=='(') {
                count++;
                max = Math.max(max, count);
            }
            else if(ch[i]==')')
                count--;
        }
        return max;
    }
}