class Solution {
    public static boolean checkPalindrome(int i, String s) {
        if(i >= s.length()-i-1)
            return true;

        if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(s.length()-i-1)))
            return false;

        return checkPalindrome(i+1, s);
    }
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        return checkPalindrome(0, s);
    }
}