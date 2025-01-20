public class print_max {
    public static int maxFind(int []arr,int n,int idx,int maxi){
        //base case;
        if(idx == n)return maxi;
        
        //processing;
        if(arr[idx] > maxi)maxi = arr[idx];
        //recurrnce relation
        return maxFind(arr, n, idx+1,maxi);
    
    }
    public static int maxInArray(int []arr){
        int n = arr.length;
        int maxi = Integer.MIN_VALUE;
        return maxFind(arr,n,0,maxi);
    }
    public static void main(String[] args) {
        int []arr = {13,3,2,0,-45,8,90};
        int ans = maxInArray(arr);
        System.out.println(ans);
    }
    
}
