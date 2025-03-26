
import java.util.Stack;

public class StackByUsingCollectionFramework {

    public static void main(String[] args) {
        //Stack Implement by using Collection Framework;
        Stack<Integer> st = new Stack<>();

        //insert element into stack;
        System.out.println(st.push(12));
        System.out.println(st.push(13));
        System.out.println(st.push(8));
        System.out.println(st.push(32));

        //remove element from Stack;
        st.pop();
        st.pop();

        //to check current topmost element of Stack;
        st.peek();
        st.peek();

        st.push(45);
        st.pop();

        st.peek();

        st.isEmpty();

    }
}
