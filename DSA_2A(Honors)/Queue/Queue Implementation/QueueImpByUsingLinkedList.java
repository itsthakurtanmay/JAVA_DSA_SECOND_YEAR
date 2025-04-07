
import java.util.LinkedList;
import java.util.Queue;

public class QueueImpByUsingLinkedList {

    public static void main(String[] args) {

        //Queue Implementation by using LinkedList;
        Queue<Integer> q = new LinkedList<>();

        //add element in Queue;
        q.add(11);
        q.add(12);
        q.add(13);

        q.offer(14);
        q.offer(15);

        //remove element in Queue;
        q.remove();

        q.poll();

        //check the topMost element;
        System.out.println(q.element());
        q.peek();

        //queue is empty or not;
        q.isEmpty();

        //size of queue;
        q.size();

        System.out.println(q);

    }
}
