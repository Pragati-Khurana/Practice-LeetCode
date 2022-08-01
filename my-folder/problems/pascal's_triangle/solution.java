class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        list.add(l1);
        
        if(numRows == 1)
            return list;
        
        List<Integer> l2 = new ArrayList<>();
        l2.add(1);
        l2.add(1);
        list.add(l2);
        
        if(numRows == 2)
            return list;
        
        for(int i=2;i<numRows;i++) {
            List<Integer> f = new ArrayList<>();
            f.add(1);
            for(int j=1;j<i;j++) {
                f.add(list.get(i-1).get(j-1)+list.get(i-1).get(j));
            }
            f.add(1);
            list.add(f);
        }
        return list;
    }
}