package Medium;

import java.util.*;

public class FruitIntoBaskets {
    public int totalFruit(int[] fruits) {
        int left = 0, right = 0, max = 0;
        int[] basket = new int[fruits.length];
        Map<Integer, Integer> count = new HashMap<>();

        while (right < fruits.length) {
            if (count.size() <= 2) {
                int fruit = fruits[right];
                basket[fruit]++;
                count.put(fruit, basket[fruit]);
                right++;
            }
            if (count.size() > 2) {
                int fruit = fruits[left];
                basket[fruit]--;
                if (basket[fruit] == 0) {
                    count.remove(fruit);
                }
                left++;
            }
            max = Math.max(max, right - left);
        }
        return max;
    }
}
