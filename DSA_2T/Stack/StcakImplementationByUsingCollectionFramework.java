
import java.util.Stack;

public class StcakImplementationByUsingCollectionFramework {

    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();

        //add element in stack;
        st.push('D');
        st.push('G');
        st.push('I');
        st.push('S');
        st.push('T');

        //remove element from the Stack
        System.out.println(st.pop());
        System.out.println(st.pop());

        //to see the topmost element from the stack
        System.out.println(st.peek());
        st.pop();
        System.out.println(st.peek());
        System.out.println(st.peek());

        //to check stack is empty or not;
        System.out.println(st.isEmpty());

        //printing stack
        System.out.println("Printing Stack");
        while (!st.isEmpty()) {
            System.out.println(st.pop());
        }

    }
}
