class Solution {
    public int maxProfit(int[] prices) {

        if(prices == null || prices.length <= 1) return 0;

        int n=prices.length,min=prices[0],max=0;

        for(int i=1;i<n;i++)
        {
            int cost=prices[i]-min;
            max=Math.max(max,cost);
            min=Math.min(min,prices[i]);
        }

        return max;        
    }
}