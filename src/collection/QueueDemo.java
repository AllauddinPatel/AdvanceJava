package collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        System.out.println(queue.peek());//top value return if queue empty return null
        System.out.println(queue.offer(60));//add value without exception
//        System.out.println(queue.add(70));//add value but when limit exide give exception
        System.out.println(queue.remove());//remove top
        System.out.println(queue.element());//returns head if queue empty return exception
        System.out.println(queue.poll());//remove top
        System.out.println(queue);
    }
}
