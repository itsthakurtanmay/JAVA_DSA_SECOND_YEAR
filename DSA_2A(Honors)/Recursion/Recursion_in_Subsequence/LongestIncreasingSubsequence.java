public class LongestIncreasingSubsequence {
        public static int solve(int []nums,int prev,int idx){
            //base case;
            if(idx == nums.length)return 0;
    
            //prcocess;
            //1. include 
            //2. exclude
            int include = 0;
            if(prev == -1 || nums[idx] > nums[prev]){
                include = 1 + solve(nums,idx,idx+1);
            }
            int exclude = solve(nums,prev,idx+1);
            return Math.max(include,exclude);
        }
        public int lengthOfLIS(int[] nums) {
            int prev =  -1;
            return solve(nums,prev,0);
            
        }
    
}
