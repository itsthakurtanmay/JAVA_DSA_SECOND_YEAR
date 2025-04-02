
import java.util.Stack;

public class MaximumNestingDepth {

    public int maxDepth(String s) {
        Stack<Character> st = new Stack<>();
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                st.push(s.charAt(i));
                count++;
                maxCount = Math.max(count, maxCount);
            } else if (s.charAt(i) == ')') {
                st.pop();
                count--;
                maxCount = Math.max(count, maxCount);
            } else {
                continue;
            }
        }
        return maxCount;
    }

}
