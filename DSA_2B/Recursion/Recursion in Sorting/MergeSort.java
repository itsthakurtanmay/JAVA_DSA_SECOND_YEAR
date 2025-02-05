public class MergeSort {
    public static void merging(int []arr,int s,int mid,int e){
        //temp array;
        int []temp = new int[e-s+1];
        int l = s;
        int r = mid+1;
        int idx = 0;

        while(l <= mid && r <= e){
            if(arr[l] < arr[r]){
                temp[idx] = arr[l];
                l++;
                idx++;
            }
            else{
                temp[idx] = arr[r];
                idx++;
                r++;
            }
        }
        while(l <= mid){
            temp[idx++] = arr[l++];
        }
        while(r <= e){
            temp[idx++] = arr[r++];
        }
        for(int i = 0;i<temp.length;i++){
            arr[i+s] = temp[i];
        }
    }
    public static void merge(int []arr,int s,int e){
        //base case;
        if(s>=e)return;

        //process / task / operation;
        int mid = s + (e-s)/2;

        //recursive function call;
        merge(arr,s,mid); //left subarray;
        merge(arr, mid+1, e); //right subarray;

        //merge 2 sorted array;
        merging(arr,s,mid,e);
    }

    public static void main(String[] args) {
        int []arr = {12,3,7,5,4,9,13};
        int s = 0;
        int e = arr.length - 1;
        merge(arr,s,e);
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}