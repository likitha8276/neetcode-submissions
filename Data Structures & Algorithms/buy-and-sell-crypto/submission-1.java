class Solution {
    public int maxProfit(int[] prices) {
        
        int right =1;
        int left =0;
        int max =0;
        while(left<prices.length && right<prices.length){
            if(prices[left]<prices[right]){
                max = Math.max(prices[right]-prices[left],max);
                
            }else{
                left=right;
                
            }
            right+=1;
        }
        return max;
    }
}
