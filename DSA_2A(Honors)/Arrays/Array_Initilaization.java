
import java.util.Scanner;

public class Array_Initilaization {
    public static void main(String[] args) {
        System.out.println("Enter the size of Array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int []arr = new int[size];

        for(int i = 0;i<size;i++){
            System.out.println("Enter the element of "+ i + " th index :");
            arr[i] = sc.nextInt();
        }

        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        
    }
}