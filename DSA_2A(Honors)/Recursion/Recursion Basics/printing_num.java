public class printing_num {
    public static void printing(int num){
        if(num == 11)return;
        
        printing(num+1);
        System.out.print(num+" ");
    }

    public static void main(String[] args) {
        int num = 1;
        printing(num);
    }
}