
public class CoinToss {

    public static void solve(int n, String ans) {
        //base case;
        if (n == 0) {
            System.out.print(ans + "   ");
            return;
        }

        //call for head;
        solve(n - 1, ans + "H");
        //call for tail;
        solve(n - 1, ans + "T");
    }

    public static void main(String[] args) {
        int n = 3;
        solve(n, "");
    }
}
