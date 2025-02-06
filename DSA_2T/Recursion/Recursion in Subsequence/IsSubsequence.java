public class IsSubsequence {
        public static int solve(String s,String t,int i,int j,int count){
            //base case;
            if(i == s.length() || j == t.length())return 0;
    
            //Recursive call
            if(s.charAt(i) == t.charAt(j)){
                count =  1 + solve(s,t,i+1,j+1,count);
            }
            else{
                count = solve(s,t,i,j+1,count);
            }
            return count;
        }
        public boolean isSubsequence(String s, String t) {
            int i =0;
            int j = 0;
            int count = 0;
            count = solve(s,t,i,j,count);
            if(count == s.length())return true;
            else return false;
            
        }
    
}
