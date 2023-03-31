class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Integer> m1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> m2 = new HashMap<Character, Integer>();
        char ch1[] = s.toCharArray();
        char ch2[] = t.toCharArray();

        int j=0;
        for(int i=0;i<ch1.length;i++) {
            if(!m1.containsKey(ch1[i])) {
                m1.put(ch1[i], j);
                j++;
            }
        }

        j=0;
        for(int i=0;i<ch2.length;i++) {
            if(!m2.containsKey(ch2[i])) {
                m2.put(ch2[i], j);
                j++;
            }
        }

        int n1=0, n2=0;
        for(int i=0;i<ch1.length;i++) {
            n1 = n1*10+m1.get(ch1[i]);
        }

        for(int i=0;i<ch2.length;i++) {
            n2 = n2*10+m2.get(ch2[i]);
        }

        if(n1==n2)
            return true;
        return false;
    }
}