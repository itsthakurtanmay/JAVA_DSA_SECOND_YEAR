public class rotateArray {
        public static void r(int []nums,int n,int idx,int []temp,int k){
           //base case;
           if(idx == n)return;
           ///processing;
            temp[(idx+k) % n] = nums[idx];
           //recursive func call;
           r(nums,n,idx+1,temp,k);
        }
        public static void rotate(int[] nums, int k) {
            int n = nums.length;
            int []temp = new int[n];
            r(nums,n,0,temp,k);
             int idx = 0;
            for(int itr : temp){
                 nums[idx++] = itr;
            }
    
            // int n = nums.length;
            // int []temp = new int[n];
            // for(int i = 0;i<nums.length;i++){
            //     temp[(i+k) % n] = nums[i];
            // }
            // int idx = 0;
            // for(int itr : temp){
            //     nums[idx++] = itr;
            // }
            
        }
        public static void main(String[] args) {
            int []arr = {1,2,3,4,5,6,7};
            int k = 3;
            rotate(arr,k);
            for(int itr : arr){
                System.out.print(arr[itr]+ " ");
            }
        }
    
    
}
