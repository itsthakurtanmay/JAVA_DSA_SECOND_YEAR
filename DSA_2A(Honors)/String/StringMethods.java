
public class StringMethods {

    public static boolean checkEqual(String s, String s1) {
        if (s == s1) {
            return true;
        }
        if (s.length() != s1.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s1.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "hello";
        String s1 = new String("Hello");
        boolean ans = checkEqual(s, s1);
        System.out.println(ans);
        // System.out.println(s == s1);
        // System.out.println(s.equals(s1));

    }
}
