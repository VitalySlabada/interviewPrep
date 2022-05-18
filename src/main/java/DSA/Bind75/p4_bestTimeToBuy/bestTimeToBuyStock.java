package DSA.Bind75.p4_bestTimeToBuy;

public class bestTimeToBuyStock {

        public int maxProfit(int[] prices) {

            int profit = 0;
            int min = Integer.MAX_VALUE;

            //iterate through an array
            for (int i=0 ; i<prices.length; i ++){
                if (prices[i]<min) min = Math.min(min, prices[i]);
                else profit = Math.max(profit, prices[i] - min);
            }
            return profit;
        }

}
