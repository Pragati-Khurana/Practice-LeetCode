class Solution {
    public static String reverseArray(char[] ch, int start, int end) {
        char temp;
        while(start<end) {
            temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
        return String.valueOf(ch);
    }
    
    public String reverseStr(String s, int k) {
        char[] ch = s.toCharArray();
        String res="";
        int i = 0, k1=0;
        
        while(i<ch.length) {
            if(k1%2==0) {
                if((i+k)-1 < ch.length) {
                    res = reverseArray(ch, i, (i+k)-1);
                }
                else {
                    res = reverseArray(ch, i, (ch.length-1));
                }
                
                // if(k>ch.length && (i+ch.length-1)<ch.length)
                //     res = reverseArray(ch, i, (i+ch.length-1));
                // else if((i+k)-1<ch.length)
                //     res = reverseArray(ch, i, (i+k)-1);
                ch = res.toCharArray();
            }
            k1++;
            i=i+k;
        }
      return res;  
    }
}