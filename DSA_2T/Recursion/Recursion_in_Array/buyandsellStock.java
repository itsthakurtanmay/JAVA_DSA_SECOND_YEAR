public class buyandsellStock {
        public static int max(int minBuy,int maxProfit,int i,int n,int []prices){
            //base case;
            if(i == n)return maxProfit;
    
            //processing
            minBuy = Math.min(minBuy,prices[i]);
            maxProfit = Math.max(maxProfit,prices[i]-minBuy);
    
    
           //function call;
           return max(minBuy,maxProfit,i+1,n,prices);
        }
        public static int maxProfit(int[] prices) {
            int minBuy = Integer.MAX_VALUE;
            int maxProfit = 0;
            int n = prices.length;
            return max(minBuy,maxProfit,0,n,prices);
            
    
        }

    
    
            // for(int i = 0;i<prices.length;i++){
            //     minBuy = Math.min(minBuy,prices[i]);
            //     maxProfit = Math.max(maxProfit,prices[i]-minBuy);
            // }
            // return maxProfit;
            public static void main(String[] args) {
                int []arr = {7,1,5,3,6,4};
                int ans = maxProfit(arr);
                System.out.println(ans);
            }
    
}
