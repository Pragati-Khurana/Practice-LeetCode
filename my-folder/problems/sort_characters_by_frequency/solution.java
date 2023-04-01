import java.util.HashMap;
import java.util.Map.Entry;

class Solution {
    public String frequencySort(String s) {
        char ch[] = s.toCharArray();
        HashMap<Character, Integer> m = new HashMap<>();
        for(int i=0;i<ch.length;i++) {
            m.put(ch[i], m.getOrDefault(ch[i],0)+1);
        }
        // LinkedHashMap<Character, Integer> m2 = m.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        // System.out.println(m2);

        List<Entry<Character, Integer>> nlist = new ArrayList<>(m.entrySet());
        nlist.sort(Entry.comparingByValue(Comparator.reverseOrder()));
        nlist.forEach(System.out::println);
        String s2="";
        for (Map.Entry<Character, Integer> e : nlist) {
            int v = e.getValue();
            while(v>0) {
                s2=s2+e.getKey();
                v--;
            }
        }
        return s2;
    }
}