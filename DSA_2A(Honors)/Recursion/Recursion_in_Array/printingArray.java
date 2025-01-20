public class printingArray {
    public static void prints(int []arr,int n,int idx){
        //base case;
        if(idx == n)return;
        //processing;
        System.out.print(arr[idx]+" ");
        //recurrnce relation
        prints(arr, n, idx+1);
    }
    public static void printing(int[]arr){
        int n = arr.length;
        prints(arr,n,0);

    }
    public static void main(String[] args) {
        int []arr = {1,2,34,5,3,45,9};
        printing(arr);
    }
}