
public class IsSubsequenceLeetcode {

    public static int solve(int i, int j, String s, String t, int count) {
        //base case;
        if (i == s.length() || j == t.length()) {
            return 0;
        }

        if (s.charAt(i) == t.charAt(j)) {
            count = 1 + solve(i + 1, j + 1, s, t, count);
        } else {
            count = solve(i, j + 1, s, t, count);
        }
        return count;
    }

    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        int count = 0;
        int ans = solve(i, j, s, t, count);
        if (ans == s.length()) {
            return true;
        } else {
            return false;
        }

    }

}
