class Solution {
    public void reverse(char[] ch, int n, int i) {
        if(i>=n/2)
            return;
        char temp = ch[i];
        ch[i] = ch[n-i-1];
        ch[n-i-1] = temp;
        reverse(ch, n, i+1);
    }

    public boolean isPalindrome(String s) {
        s = s.replaceAll("\\s", "");
        s = s.replaceAll("[^a-zA-Z0-9]","");
        s = s.toLowerCase();
        char ch[] = s.toCharArray();
        reverse(ch, s.length(), 0);
        String rs = String.valueOf(ch);

        if(s.equals(rs))
            return true;
        else
            return false;
    }
}