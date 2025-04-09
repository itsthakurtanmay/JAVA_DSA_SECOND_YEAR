
import java.util.Arrays;
import java.util.Stack;

class CarFleet {

    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        int[][] cars = new int[n][2];
        for (int i = 0; i < n; i++) {
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }

        Arrays.sort(cars, (a, b) -> Integer.compare(a[0], b[0])); // sort by position

        Stack<Double> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            double time = (double) (target - cars[i][0]) / cars[i][1];
            if (st.isEmpty() || time > st.peek()) {
                st.push(time);
            }
        }

        return st.size();
    }
}
