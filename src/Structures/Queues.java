package Structures;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Queues {
    public static void ArrayBlockingQueueExample() {
        Queue<Person> queue = new ArrayBlockingQueue<>(5);
        queue.add(new Person("Artem", 18));
        queue.add(new Person("Bob", 28));
        queue.add(new Person("Alice", 22));
        queue.add(new Person("Martin", 46));
        queue.add(new Person("Zack", 32));
        System.out.println(queue);

    }

    public static void FIFODequeExample() {
        Deque<Person> deque = new ArrayDeque<>();
        deque.add(new Person("Artem", 18));
        deque.add(new Person("Bob", 28));
        deque.add(new Person("Alice", 22));
        deque.add(new Person("Martin", 35));
        deque.add(new Person("Zack", 46));
        System.out.println(deque);
        System.out.println(deque.peek());
        System.out.println(deque);
        System.out.println(deque.pop());
        System.out.println(deque);
        System.out.println(deque.poll());
        System.out.println(deque.pollLast());
        System.out.println(deque);
    }
}
