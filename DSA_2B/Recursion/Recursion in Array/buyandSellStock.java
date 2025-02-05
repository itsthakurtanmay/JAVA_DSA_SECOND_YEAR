public class buyandSellStock {
        public static int maxPro(int min,int mProfit,int idx,int []prices,int n){
            //base case;
            if(idx == n)return mProfit;
    
            //process;
            min = Math.min(min,prices[idx]);
            mProfit = Math.max(mProfit,prices[idx] - min);
    
            //recursive function call;
            return maxPro(min,mProfit,idx+1,prices,n);
        }
        public static int maxProfit(int[] prices) {
            int min = Integer.MAX_VALUE;
            int mProfit = 0;
            int n = prices.length;
            return maxPro(min,mProfit,0,prices,n);
            // for(int i = 0;i<prices.length;i++){
            //     min = Math.min(min,prices[i]);
            //     mProfit = Math.max(mProfit,prices[i] - min);
            // }
            // return mProfit;
            
        }
        public static void main(String[] args) {
            int []arr  ={7,1,5,3,6,4};
            int ans = maxProfit(arr);
            System.out.println(ans);

        }
    
    
}
