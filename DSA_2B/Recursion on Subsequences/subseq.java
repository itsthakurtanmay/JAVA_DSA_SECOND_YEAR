import java.util.* ;
public class subseq {
    public static void sub(String str,String ans,int idx,ArrayList<String>al,int n){
        //base case;
        if(idx == n){
            if(ans.length() != 0)al.add(ans);
            return;
        }

        //func call;

        //include
        sub(str,ans+str.charAt(idx),idx+1,al,n);
        //exclude
        sub(str,ans,idx+1,al,n);
    }
    public static ArrayList<String> subsequences(String str) {
        // Write your code here
        ArrayList<String>al = new ArrayList<>();
        String ans = "";
        sub(str,ans,0,al,str.length());
        return al;
    }
}