public class linearSearch {
    public static int searching(int n,int []arr,int x,int idx){
        //base case;
        if(idx == n)return -1;
        
        //process 
        if(arr[idx] == x)return idx;
        
        //function call;
        return searching(n,arr,x,idx+1);
    }

    public static int search(int arr[], int x) {

        // Your code here
        int n = arr.length;
        return searching(n,arr,x,0);
    }
    public static void main(String[] args) {
        int []arr = {12,34,98,45,9};
        int key = 12;
        int ans = search(arr,key);
        System.out.println(ans);
    }
    
}
