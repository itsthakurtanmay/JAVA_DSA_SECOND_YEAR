public class StringMemoryAllocation {
    public static void main(String[] args) {
        //by using String literals

        // String s = "hello bhai";
        // String s1 = new String("hello by new keyword");

        // System.out.println(s);
        // System.out.println(s1);

        //Question time

        String s = "hello bhai";
        String s1 = "hello bhai";
        String s2 = new String("hello bhai");
        String s3 = new String("hello bhai");

        System.out.println(s == s1);
        System.out.println(s == s2);
        System.out.println(s2 == s3);

        System.out.println(System.identityHashCode(s));
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        System.out.println(System.identityHashCode(s3));


    }
    
}
