public class QuickSort {
    public static int partition(int []arr,int s,int e){
        int pos = s;
        int pivot = arr[e];
        for(int i = s;i<=e;i++){
            if(arr[i] <= pivot){
                //swap(arr[i],arr[pos])
                int temp = arr[i];
                arr[i] = arr[pos];
                arr[pos] = temp;
                pos++;
            }
        }
        return pos-1;
    }
    public static void Qs(int []arr,int s,int e){
        //base case;
        if(s>=e)return;

        //processing;
        int pivot = partition(arr,s,e);

        //recursive function call;
        Qs(arr, s, pivot-1); //Left subarray
        Qs(arr, pivot+1,e); //right subarray
    }
    public static void main(String[] args) {
        int []arr = {5,1,1,2,0,0};
        int s = 0;
        int e = arr.length-1;
        Qs(arr,s,e);
        for(int itr : arr){
            System.out.print(itr +" ");
        }
    }
    
}
