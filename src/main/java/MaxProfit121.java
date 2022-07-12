public class MaxProfit121 {
    // Time O(n) Mem O(1)
    public int maxProfit(int[] prices) {
        int max = 0;
        int left = 0;
        int right = 1;

        for(int i = 0; i < prices.length-1; i++) {

            if(prices[left] > prices[i]){
                left = i;
            }

            if(prices[right] - prices[left] > max){
                max = prices[right] - prices[left];
            }
            right += 1;
        }
        return max;
    }
}
