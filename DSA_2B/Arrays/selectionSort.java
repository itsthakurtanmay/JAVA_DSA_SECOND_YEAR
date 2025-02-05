public class selectionSort {
    public static int[] Sort(int[] arr) {
        // code here
        int n = arr.length;
        for(int i =0;i<=n-2;i++){
            int min = i;
            for(int j =i+1;j<=n-1;j++){
                if(arr[j] < arr[min])min = j;
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;   
        }
        return arr;
    }
    public static void main(String[] args) {
        int []arr = {4, 1, 3, 9, 7};
        int[]ans = Sort(arr);
        for(int itr : ans){
            System.out.print(itr+" ");
        }
        
    }
    
}
