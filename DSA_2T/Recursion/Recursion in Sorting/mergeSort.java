public class mergeSort {
    public static void merging(int[]arr,int s,int mid,int e){
        int l = s;
        int r = mid+1;
        int idx = 0;
        int []temp = new int[e-s+1];

        while(l <= mid && r <= e){
            if(arr[l] < arr[r]){
                temp[idx] = arr[l];
                idx++;
                l++;
            }
            else{
                temp[idx] = arr[r];
                r++;
                idx++;
            }
        }

        while(l<= mid){
            temp[idx] = arr[l];
            idx++;
            l++; 
        }

        
        while(r<= e){
            temp[idx] = arr[r];
            idx++;
            r++; 
        }

        for(int i = 0;i<temp.length;i++){
            arr[s+i] = temp[i];
        }
    }
    public static void merge(int []arr,int s,int e){
        //base case;
        if(s>=e)return;

        //process;
        int mid = (s+e)/2;


        //recursive fuction call;
        merge(arr, s, mid);
        merge(arr, mid+1, e);

        //merging 2 sorted array;
        merging(arr,s,mid,e);

    }

    public static void main(String[] args) {
        int []arr = {12,34,2,38,99,99,23,8};
        int s = 0;
        int e = arr.length - 1;
        merge(arr,s,e);
        for(int itr : arr){
            System.out.print(itr +"  ");
        }
    }
}