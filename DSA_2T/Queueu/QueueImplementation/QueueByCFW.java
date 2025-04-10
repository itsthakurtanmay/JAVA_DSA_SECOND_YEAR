
import java.util.LinkedList;
import java.util.Queue;

public class QueueByCFW {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        //Enqueue;
        q.add(11);
        q.add(19);
        q.add(34);
        q.add(1);

        q.offer(45);
        q.offer(55);

        //dequeue;
        System.out.println(q.remove());
        q.offer(55);
        q.offer(5);
        System.out.println(q.poll());

        //topmost element ;
        System.out.println(q.peek());
        System.out.println(q.poll());
        q.offer(55);
        System.out.println(q.element());
        System.out.println(q.poll());

        //check queue is empty or not;
        System.out.println(q.isEmpty());

        //checking queue's size;
        System.out.println(q.size());
        System.out.println(q.poll());
        System.out.println(q.size());

    }
}
