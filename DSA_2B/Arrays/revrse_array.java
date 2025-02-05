public class revrse_array {
    // public static int[] swapping(int[]arr,int first,int last){
    //     int temp = first;
    //     first = last;
    //     last = temp;
    // }
    public static int[] reverseArr(int []arr){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            // arr = swapping(arr,arr[start],arr[end]);
            start++;
            end--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int []arr = {12,34,5,6,9,45};
        for(int itr : arr){
            System.out.print(itr+" ");
        }
        System.out.println();

        int []ans = reverseArr(arr);
        for(int itr : ans){
            System.out.print(itr+" ");
        }
    }
    
}
