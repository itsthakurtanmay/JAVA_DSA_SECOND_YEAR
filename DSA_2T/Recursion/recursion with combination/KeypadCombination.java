
import java.util.ArrayList;
import java.util.List;

public class KeypadCombination {

    public static void solve(String digits, String output, int idx, List<String> ans, String[] mapping) {
        //base case;
        if (idx == digits.length()) {
            ans.add(output);
            return;
        }

        //convert char to int
        int num = digits.charAt(idx) - '0';
        //accessing value of num index;
        String val = mapping[num];

        for (int i = 0; i < val.length(); i++) {
            solve(digits, output + val.charAt(i), idx + 1, ans, mapping);
        }

    }

    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits.length() == 0) {
            return ans;
        }
        String output = "";
        String[] mapping = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        solve(digits, output, 0, ans, mapping);
        return ans;
    }

}
