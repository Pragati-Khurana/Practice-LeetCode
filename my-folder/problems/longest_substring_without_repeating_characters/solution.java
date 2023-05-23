class Solution {
    public int lengthOfLongestSubstring(String s) {
        char ch[] = s.toCharArray();
        int count=0, maxCount=0, start=0;
        Set<Character> s1 = new HashSet<Character>();

        for(int i=0;i<ch.length;i++) {
            if(s1.contains(ch[i])) {
                maxCount = Math.max(count, maxCount);
                while(ch[start]!=ch[i]) {
                    s1.remove(ch[start]);
                    count--;
                    start++;
                }
                start++;
            } else {
                count++;
                s1.add(ch[i]);
            }
        }
        maxCount = Math.max(count, maxCount);
        return maxCount;
    }
}