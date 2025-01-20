public class subsequence {
    public static void subs(String str,int idx,String ans){
        //Base Case
        if(idx == str.length()){
            System.out.println(ans+" ");
            return;
        }
        //Include
        subs(str,idx+1,ans+str.charAt(idx));

        //Exclude
        subs(str,idx+1,ans);
    }
    public static void main(String[] args) {
        String str = "abc";
        String ans = "";
        subs(str,0,ans);
    }
    
}
