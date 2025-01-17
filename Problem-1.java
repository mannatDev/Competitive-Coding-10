//TC: O(n)
//SC: O(1)

class Solution {
    public int maxProfit(int[] prices) {
      
      
      int profit = 0;                     //0
      for(int i=1;i<prices.length;i++)    // i=1
      {
        if(prices[i] > prices[i-1])
        {
          profit += prices[i] - prices[i-1];
        }
      }
        return profit;
    }
}
