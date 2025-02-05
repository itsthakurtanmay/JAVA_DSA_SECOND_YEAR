public class ReverseWordInString {
        public static String rev_s(String s){
            s = s.trim(); //it remove starting and ending extra space;
            String []arr = s.split("\\s+");
            String ans = "";
            for(int i = arr.length-1;i>=0;i--){
              ans = ans+arr[i]+" ";
            }
            return ans.trim();
            
          }
            public String reverseWords(String s) {
                return rev_s(s);
                
            }
    
}
