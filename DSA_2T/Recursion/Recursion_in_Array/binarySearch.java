public class binarySearch {
        public static int binary(int s,int e,int nums[],int target){
            //base case;
            if(s>e)return -1;
    
            ///processs/task;
            int mid = (s+e)/2;
            if(nums[mid] == target)return mid;
            
            //function call;
            else if(nums[mid] < target)return binary(mid+1,e,nums,target);
            else return binary(s,mid-1,nums,target);
        }
        public static int search(int[] nums, int target) {
            int s = 0;
            int e = nums.length-1;
    
            return binary(s,e,nums,target);
            
        }
        public static void main(String[] args) {
            int []arr = {-1,0,3,5,9,12};
            int key = 9;
            int ans = search(arr,key);
            System.out.println(ans);
        }
    
    
}
