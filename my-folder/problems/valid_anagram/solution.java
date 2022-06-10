class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ch1 = s.toCharArray();   
        char[] ch2 = t.toCharArray();   

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        
        if(String.valueOf(ch1).equals(String.valueOf(ch2)))
            return true;

        return false;
    }
}