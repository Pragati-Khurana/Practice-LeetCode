class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] arr = s.split("\s+");
        String res="";
        
        for(int i=arr.length-1;i>0;i--) {           
            res += arr[i] + " ";
        }
        
        return res+arr[0];
    }
}