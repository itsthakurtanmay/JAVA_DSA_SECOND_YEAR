
import java.util.Stack;

public class MinAdd {

    //STACK APPROACH;
    public int minAddToMakeValid(String S) {
        int res = 0;
        Stack<Character> stack = new Stack<>();
        for (char c : S.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.empty()) {
                    res++;
                } else {
                    stack.pop();
                }
            }
        }
        return res + stack.size();
    }

    //OPTIMIZED APPROACH;
    // public int minAddToMakeValid(String s) {
    //     int open_c = 0;
    //     int close_c = 0;
    //     for (char c : s.toCharArray()) {
    //         if (c == '(') {
    //             open_c++;
    //         } else if (c == ')' && open_c > 0) {
    //             open_c--;
    //         } else {
    //             close_c++;
    //         }
    //     }
    //     return open_c + close_c;
    // }
}
