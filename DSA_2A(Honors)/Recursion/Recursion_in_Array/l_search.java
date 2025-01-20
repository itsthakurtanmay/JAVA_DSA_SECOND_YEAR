public class l_search {
    public static int linearSearch(int[]arr,int idx,int n,int x){
        //base case;
        if(idx == n)return -1;
        //process;
        if(arr[idx] == x)return idx;
        //RR
        return linearSearch(arr,idx+1,n,x);
    }

    public static int search(int arr[], int x) {
        int n = arr.length;
        return linearSearch(arr,0,n,x);

        // Your code here
    }
    public static void main(String[] args) {
        int []arr = {10, 8, 30, 4, 5};
        int x = 5;
        System.out.println(search(arr,x));
    }
    
}
