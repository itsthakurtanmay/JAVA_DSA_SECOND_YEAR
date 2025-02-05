public class printingArray {

    public static void prints(int []arr,int n,int idx){
        //base case
        if(idx == n)return;

        //process;
        System.out.print(arr[idx]+" ");

        //rf
        prints(arr, n, idx+1);
    }
    public static void arrayprint(int []arr){
        int n = arr.length;
        prints(arr,n,0);
    }

    public static void main(String[] args) {
        int []arr = {1,23,4253,974839,78,89};
        arrayprint(arr);
    }
}