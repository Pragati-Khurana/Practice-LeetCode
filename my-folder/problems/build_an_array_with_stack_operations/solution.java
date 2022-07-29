class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> l = new ArrayList<>();
        int flag;
        
        for(int i=1;i<=n;i++) {
            flag = 0;
            for(int j=0;j<target.length;j++) {
                if(target[j]==i) {
                    flag = 1;
                    break;
                }   
            }
            if(flag == 1)
                l.add("Push");
            else {
                l.add("Push");
                l.add("Pop");
            }
            if(target[target.length-1]==i)
                break;
        }
        return l;
    }
}