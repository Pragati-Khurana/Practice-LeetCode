class Solution {
    public String longestCommonPrefix(String[] strs) {
        int mini=0, minl=Integer.MAX_VALUE;
        for(int i=0;i<strs.length;i++) {
            if(strs[i].length()<minl) {
                minl=strs[i].length();
                mini=i;
            }
        }

        String word=strs[mini];
        int j=minl;
        int flag=-1;

        while(j>=0) {
            for(int i=0;i<strs.length;i++) {
                if(!strs[i].substring(0,j).equals(word)) {
                    j--;
                    word=word.substring(0,j);
                    flag=0;
                    break;
                }
                else {
                    flag=1;
                }
            }
            if(flag==1)
                return word;
        }
        return "";
    }
}