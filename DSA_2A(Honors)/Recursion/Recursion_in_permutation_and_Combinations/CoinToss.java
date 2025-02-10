
public class CoinToss {

    public static void solve(int n, String ans) {
        //base case;
        if (n == 0) {
            System.out.println(ans);
            return;
        }

        //recursive call for "Head"
        solve(n - 1, ans + "H");
        //recursive call for "Tail"
        solve(n - 1, ans + "T");
    }

    public static void main(String[] args) {
        int n = 4;
        String ans = "";
        solve(n, ans);
        
    }
}
