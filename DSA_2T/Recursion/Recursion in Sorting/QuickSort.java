public class QuickSort {
    public static int findCorrectIndexOfPivot(int []arr,int s,int e){
        int pivot = arr[e];
        int pos = s;
        for(int i = s;i<= e;i++){
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
    public static void qs(int []arr,int s,int e){
        //base case;
        if(s>=e)return;

        //prcoess;
        int pivot = findCorrectIndexOfPivot(arr,s,e);

        //function call;
        qs(arr, s, pivot-1);
        qs(arr, pivot+1,e);
    }

    public static void main(String[] args) {
        int []arr = {12,34,9,4,37,9,68,45};
        int s =0;
        int e = arr.length-1;
        qs(arr,s,e);
        for(int itr : arr){
            System.out.print(itr+" ");
        }
    }
}