public class firstAndlastOccurence {
        public static int[] searchRange(int[] nums, int target) {
            int []arr = new int[2];
            int first = -1;
            int last = -1;
            int s = 0;
            int e = nums.length -1;
            while(s<=e){
                int mid = s + (e-s)/2;
    
                if(nums[mid] == target){
                    first = mid;
                    e = mid-1;
                }
                else if(nums[mid] < target)s = mid+1;
                else e = mid-1;
            }
            int st = 0;
            int et = nums.length -1;
            while(st<=et){
                int mid = st + (et-st)/2;
    
                if(nums[mid] == target){
                    last = mid;
                    st = mid+1;
                }
                else if(nums[mid] < target)st = mid+1;
                else et = mid-1;
            }
            arr[0] = first;
            arr[1] = last;
            return arr;
            
            
        }
    public static void main(String[] args) {
        int []arr = {5,7,7,8,8,10};
        int target = 8;
        int []ans = searchRange(arr,target);
        for(int itr : ans){
            System.out.println(itr+" ");
        }

    }
    
}
