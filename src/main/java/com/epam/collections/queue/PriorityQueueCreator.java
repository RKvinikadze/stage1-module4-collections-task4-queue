package com.epam.collections.queue;

import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> b.compareTo(a));

        pq.addAll(firstList);

        pq.addAll(secondList);

        return pq;
    }
}
