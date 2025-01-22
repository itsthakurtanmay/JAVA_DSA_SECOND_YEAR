public class maxINArray {
    public static int searching(int n,int []arr,int x,int idx){
        //base case;
        if(idx == n)return x;
        
        //process 
        if(arr[idx] > x)x = arr[idx];
        
        //function call;
        return searching(n,arr,x,idx+1);
    }

    public static int search(int arr[]) {

        // Your code here
        int n = arr.length;
        int x = Integer.MIN_VALUE;
        return searching(n,arr,x,0);
    }
    public static void main(String[] args) {
        int []arr = {12,34,98,45,9};
        int ans = search(arr);
        System.out.println(ans);
    }
    
}
