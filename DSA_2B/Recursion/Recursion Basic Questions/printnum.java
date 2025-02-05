public class printnum {
    public static void print(int count){
        //base case
        if(count == 11)return;

        //operation/processing
        System.out.print(count+" ");

        //recursive fun
        print(count+1);

    }
    public static void main(String[] args) { //Entry Point
        int count = 1;
        print(count);
        
    }

    
}