package com.epam.collections.queue;

import java.util.*;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        Queue<Integer> q = new LinkedList<>();
        for (int i=1; i<=numberOfDishes; i++)
            q.add(i);

        List<Integer> res = new ArrayList<>();
        int curr = 0;
        while (!q.isEmpty()){
            int currDish = q.poll();
            curr = curr + 1;

            if (curr % everyDishNumberToEat == 0) {
                res.add(currDish);
                curr = 0;
            }
            else q.add(currDish);
        }

        return res;
    }

}
