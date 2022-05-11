class Solution {
    public int maxProfit(int[] prices) {
        int profit=0,buy =214748364;
        for(int x : prices){
            if(buy >x){
                buy =x;
            }
            if((x-buy)>profit){
                profit=x-buy;
            }
        }
        
        return profit;
        
    }
}
