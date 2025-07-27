class Solution {
    public int romanToInt(String s) {
        char ch[] = s.toCharArray();
        HashMap<Character, Integer> m = new HashMap<Character, Integer>();
        int sum = 0;

        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);

        for(int i=0; i<ch.length-1; i++) {
            if(m.get(ch[i]) < m.get(ch[i+1]))
                sum = sum + (-m.get(ch[i]));
            else
                sum = sum + m.get(ch[i]);
        }
        sum = sum + m.get(ch[ch.length-1]);

        return sum;
    }
}