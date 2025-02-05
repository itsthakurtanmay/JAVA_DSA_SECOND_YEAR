public class findMax {
    public static int prints(int []arr,int n,int idx,int maxi){
        //base case
        if(idx == n)return maxi;

        
        //process;
        if(arr[idx] > maxi)maxi = arr[idx];
       

        //rf
        return prints(arr, n, idx+1,maxi);

        
       
    }
    public static int maxFind(int []arr){
        int n = arr.length;
        int maxi = Integer.MIN_VALUE;
        return prints(arr,n,0,maxi);

    }
    public static void main(String[] args) {
        int []arr = {12,34,2,9,6,56,5};
        int ans = maxFind(arr);
        System.out.println(ans);
    }
    
}
