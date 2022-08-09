class Solution {
    public int[][] merge(int[][] intervals) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        
        Arrays.sort(intervals, (a,b)->a[0]-b[0]);
        
        int i=1;
        s1.push(intervals[0][0]);
        s2.push(intervals[0][1]);
        while(i<intervals.length) {
            
            if(intervals[i][0] <= s2.peek()) {
                int num = Math.max(s2.pop(), intervals[i][1]);
                s2.push(num);
            }
            else {
                s1.push(intervals[i][0]);
                s2.push(intervals[i][1]);
            }
            i++;
        }
        
        int[][] res = new int[s1.size()][2];
        for(i=s1.size()-1;i>=0;i--) {
            res[i][0] = s1.pop();
            res[i][1] = s2.pop();
        }
        
        return res;
    }
}