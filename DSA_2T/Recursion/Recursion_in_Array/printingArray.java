public class printingArray {
    public static void printing(int []arr,int n,int idx){
        //base case;
        if(idx == n)return;


        ///rr;
        printing(arr, n, idx+1);
        
        //process;
        System.out.print(arr[idx]+" ");
    }
    public static void print(int []arr){
        int n = arr.length;
        printing(arr,n,0);

    }

    public static void main(String[] args) {
        int []arr = {1,2,4,2,9,6,9};
        print(arr);
    }
}