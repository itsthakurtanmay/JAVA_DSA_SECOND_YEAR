
import java.util.Stack;

public class StackImplementation {

    public static void main(String[] args) {
        //stack implement by using Collection Framework;
        Stack<Character> heraferi = new Stack<>();

        //add in stack;
        heraferi.push('A');
        heraferi.push('Z');
        heraferi.push('M');
        heraferi.push('N');

        //remove last element from stack;
        System.out.println(heraferi.pop());//->N
        System.out.println(heraferi.pop());//->M;

        //peek() -> return topmost element;
        System.out.println(heraferi.peek());//-> N ,Z
        System.out.println(heraferi.peek());//-> M ,Z

        //check stack empty or not;
        System.out.println(heraferi.isEmpty());

        //size of stack;
        System.out.println(heraferi.size());
    }
}
