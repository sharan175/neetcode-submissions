class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int j=0;
        for(int i=0;i<prices.length;i++){
            if(prices[j]<prices[i]){
                profit=Math.max(profit,prices[i]-prices[j]);
            }
            else{
                j=i;
            }
        }
        return profit;
    }
}
