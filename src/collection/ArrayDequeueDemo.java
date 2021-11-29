package collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ArrayDequeueDemo {
    public static void main(String[] args) {
        Deque<Integer> deque= new ArrayDeque<>();
        deque.add(10);
        deque.add(10);
        deque.add(20);
        deque.add(30);
        deque.add(40);
        deque.offer(50);


//        System.out.println(deque.removeFirstOccurrence(10));//remove Duplicate
//        System.out.println(deque.offerLast(60));
//        System.out.println(deque.peek());//return head
//        System.out.println(deque.pop());//give first element of list and remove
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());//remove
        System.out.println(deque);


//        Iterator<Integer> iterator=deque.descendingIterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());//Print reverse dequeue
//        }
    }
}
