
import java.util.LinkedList;
import java.util.Queue;

public class QueueByCFW {

    public static void main(String[] args) {
        //Implementing Queue by using LinkedList;
        Queue<Integer> q = new LinkedList<>();

        //1. Add element in queue;
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        //Adding element by using offer;
        q.offer(23);
        q.offer(34);

        //2. Removing element by using .remove and .poll();
        System.out.println(q.poll());
        System.out.println(q.poll());
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(2);
        q.add(3);
        System.out.println(q.remove());

        //3. Topmost/ Front element ko dekhna ho;
        System.out.println(q.peek());
        q.add(28);
        System.out.println(q.element());
        System.out.println(q.remove());

        //4.check empty or not;
        System.out.println(q.isEmpty());
        System.out.println(q.remove());
        System.out.println(q.isEmpty());

        //5. Check size of queue;
        System.out.println(q.size());
        System.out.println(q.remove());
        System.out.println(q.size());

    }
}
