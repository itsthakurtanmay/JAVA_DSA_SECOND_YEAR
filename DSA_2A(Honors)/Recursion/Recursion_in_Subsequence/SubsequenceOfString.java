
import java.util.*;

public class SubsequenceOfString {

    public static void printSub(String str, String ans, int idx, int n, ArrayList<String> al) {
        //base case;
        if (idx == n) {
            if (ans.length() != 0) {
                al.add(ans);
            }
            return;
        }

        //include
        printSub(str, ans + str.charAt(idx), idx + 1, n, al);

        //exclude
        printSub(str, ans, idx + 1, n, al);

    }

    public static ArrayList<String> subsequences(String str) {
        // Write your code here
        String ans = "";
        ArrayList<String> al = new ArrayList<>();
        printSub(str, ans, 0, str.length(), al);
        return al;
    }

    public static void main(String[] args) {
        String str = "abc";
        ArrayList<String> ans = subsequences(str);
        for (String itr : ans) {
            System.out.println(itr + " ");
        }
    }
}
