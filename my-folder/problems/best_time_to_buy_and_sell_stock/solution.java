class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int p=0;
        
        for(int i=1;i<prices.length;i++) {
            if(prices[i]>min) {
                if(prices[i]-min > p)
                    p = prices[i]-min;
            }
            else
                min = prices[i];
        }
        return p;
    }
}