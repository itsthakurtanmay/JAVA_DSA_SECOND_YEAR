public class moveZeroes {
        public static void move(int i,int j,int n,int []nums){
            //base case;
            if(j == n){
                while(i < n){
                    nums[i++] = 0;
                }
                return;
            }
    
            //process;
            if(nums[j] != 0){
                nums[i] = nums[j];
                move(i+1,j+1,n,nums);
                return;
            }
            move(i,j+1,n,nums);
        }
        public static void moveZeroes(int[] nums) {
            int i = 0;
            int j = 0;
            int n = nums.length;
            move(i,j,n,nums);
            
        }
        public static void main(String[] args) {
            int []arr = {0,1,0,3,12};
            moveZeroes(arr);
            for(int itr : arr){
                System.out.println(itr + " ");
            }
        }
    
    
}
