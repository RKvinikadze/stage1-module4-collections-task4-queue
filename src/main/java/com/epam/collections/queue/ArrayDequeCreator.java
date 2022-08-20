package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> res = new ArrayDeque<>();
        res.add(firstQueue.poll());
        res.add(firstQueue.poll());

        res.add(secondQueue.poll());
        res.add(secondQueue.poll());

        while (firstQueue.size() != 0 && secondQueue.size() != 0){
            int curr = res.pollLast();
            firstQueue.add(curr);
            res.add(firstQueue.poll());
            res.add(firstQueue.poll());

            curr = res.pollLast();
            secondQueue.add(curr);
            res.add(secondQueue.poll());
            res.add(secondQueue.poll());
        }

        return res;
    }
}
