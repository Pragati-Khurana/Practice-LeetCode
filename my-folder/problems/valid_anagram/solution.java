class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> m1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> m2 = new HashMap<Character, Integer>();

        char ch1[] = s.toCharArray();
        char ch2[] = t.toCharArray();

        for(int i=0;i<ch1.length;i++) {
            m1.put(ch1[i], m1.getOrDefault(ch1[i],0)+1);
        }

        for(int i=0;i<ch2.length;i++) {
            m2.put(ch2[i], m2.getOrDefault(ch2[i],0)+1);
        }

        if(m1.equals(m2))
            return true;
        return false;
    }
}