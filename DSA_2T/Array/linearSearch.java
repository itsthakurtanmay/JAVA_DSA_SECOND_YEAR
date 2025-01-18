import java.util.Scanner;

public class linearSearch {
    public static int linearSearching(int []arr,int n,int key){
        int idx = 0;
        for(int atul : arr){
            if(atul == key)return idx;
            idx++;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt(); 
        int []arr = new int[size];

        for(int i = 0;i<size;i++){
            System.out.println("Enter the value at "+ i + "th index");
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the key element");
        int key = sc.nextInt();

        System.out.println(linearSearching(arr,size,key));

        // printing array

        // for each
        // int count = 0;
        // for(int itr : arr){
        //     if(count == 3)break;
        //     System.out.print(itr + " ");
        //     count++;
        // }
    }
}