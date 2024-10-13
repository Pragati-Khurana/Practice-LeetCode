class Solution {
    public int maxDepth(String s) {
        int flag = 0, maxF = 0;;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '(') {
                flag++;
                maxF = Math.max(maxF, flag);
            }
            else if(s.charAt(i) == ')')
                flag--;
        }
        return maxF;
    }
}