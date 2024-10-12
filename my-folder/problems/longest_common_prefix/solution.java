class Solution {
    public String longestCommonPrefix(String[] strs) {
        int minLength = strs[0].length();
        int minWordIndex = 0;
        int j = 0;
        String word = "";
        int flag = 0;

        for(int i=1; i<strs.length; i++) {
            if(strs[i].length() < minLength) {
                minLength = strs[i].length();
                minWordIndex = i;
            }
        }

        j = minLength;
        word = strs[minWordIndex];

        while(j > 0) {
            for(int i=0; i<strs.length; i++) {
                if(!strs[i].substring(0, j).equals(word)) {
                    flag = 0;
                    j--;
                    word = word.substring(0, j);
                    break;
                }
                else
                    flag = 1;
            }
            if(flag == 1)
                return word;
        }
        return "";  
    }
}