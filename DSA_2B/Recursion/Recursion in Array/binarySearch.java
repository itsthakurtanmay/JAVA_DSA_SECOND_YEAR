import java.util.Scanner;

public class binarySearch {
    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target)return mid;
            else if(nums[mid] < target)start = mid+1;
            else end = mid-1;
        }
        return -1;    
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = sc.nextInt();
        int[]arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target : ");
        int target = sc.nextInt();
        int ans = search(arr,target);
        System.out.println(ans);
        
    }
}