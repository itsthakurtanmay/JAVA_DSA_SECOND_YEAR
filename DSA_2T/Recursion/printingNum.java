public class printingNum {
    public static void print(int count){
        if(count == 11)return;//Base Case
        //Operation/processing
        print(count+1);//Recursive function call;
        System.out.println(count);
    }

    public static void main(String[] args) {
        int count = 1;
        print(count);
    }
}