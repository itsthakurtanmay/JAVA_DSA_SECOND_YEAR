
import java.util.Stack;

public class NextGreaterEle {

    public static void nextGreaterElement(int[] arr) {
        Stack<Integer> st = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                System.out.print("-1 ");
            } else {
                System.out.print(st.peek() + " ");
            }
            st.push(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10, 8};
        nextGreaterElement(arr);

    }

}
