package Collections.Queue;

import java.util.ArrayDeque;

public class ArrayDequeueDemo {

    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(23);
        adq.offer(13);
        adq.offer(27);
        adq.offer(33);
        adq.offer(24);
        System.out.println(adq);

        adq.addFirst(0);
        adq.addLast(100);
        System.out.println(adq);

        adq.pollFirst();
        adq.pollLast();
        System.out.println(adq);
    }
}
