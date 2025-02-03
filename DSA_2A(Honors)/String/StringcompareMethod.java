
public class StringcompareMethod {

    public static int comparisionFunc(String s1, String s2) {
        if (s1 == s2) {
            return 0;
        }
        int len = Math.min(s2.length(), s1.length());
        for (int i = 0; i < len; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return s1.charAt(i) - s2.charAt(i);
            }
        }
        return s1.length() - s2.length();
    }

    public static void main(String[] args) {
        String s1 = "apple";
        String s2 = "app";
        // System.out.println(s1.compareTo(s2));
        int ans = comparisionFunc(s1, s2);

        System.out.println(ans);

    }
}
