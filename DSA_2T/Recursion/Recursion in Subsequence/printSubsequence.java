public class printSubsequence {

    public static void printSub(String str,int idx,int n,String ans){
        //base case;
        if(idx == n){
            System.out.println(ans);
            return;
        }

        //process + Recursive fuction call;
        //include
        printSub(str, idx+1, n, ans+str.charAt(idx));
        //exclude
        printSub(str, idx+1, n, ans);
    }
    public static void main(String[] args) {
        String str = "abc";
        int n = str.length();
        String ans = "";
        printSub(str,0,n,ans);
    }
}