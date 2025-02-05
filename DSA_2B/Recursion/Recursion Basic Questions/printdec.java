public class printdec {
    public static void print(int count){
        //base case
        if(count == 11)return;

        //recursive fun
        print(count+1);

          //operation/processing
          System.out.print(count+" ");

    }
    public static void main(String[] args) { //Entry Point
        int count = 1;
        print(count);
        
    }

    
}