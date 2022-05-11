class Solution {
    public int maxProfit(int[] prices) {
        int profit=0,buy =Integer.MAX_VALUE;
        int count=0,tp=0;
        for(int x : prices){
            if(buy >x){
                buy = x;
            }
            if (count==1 && (x-buy)<=profit){
                count = 0;
                tp =tp + profit;
                profit =0;
                buy = x;
            } 
            else if((x-buy)>profit){
                count =1;
                profit=x-buy;
            }
        }
        if(profit>0){
            tp = tp+profit;
        }
        return tp;
    }
}