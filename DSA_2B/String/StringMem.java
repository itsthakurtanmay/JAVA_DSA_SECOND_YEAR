public class StringMem {
    public static void main(String[] args) {
        String s = "hello";
        String s1 = "hello";
        String s2 = new String("hello");
        String s3 = new String("hello");

        System.out.println(s == s1);
        System.out.println(s == s2);
        System.out.println(s2 == s3);

        System.out.println(System.identityHashCode(s));
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        System.out.println(System.identityHashCode(s3));
    }
    
}
