package Medium;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class DesignaFoodRatingSystem {
    class FoodRatings {
        public class FOOD {
            String f;
            String c;
            int r;

            public FOOD(String food, String cuisine, int rating) {
                f = food;
                c = cuisine;
                r = rating;
            }
        }

        Map<String, PriorityQueue<FOOD>> cMap;
        Map<String, FOOD> fMap;

        public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
            cMap = new HashMap<>();
            fMap = new HashMap<>();
            for (int i = 0; i < foods.length; i++) {

                FOOD foodITEM = new FOOD(foods[i], cuisines[i], ratings[i]);

                fMap.put(foods[i], foodITEM);

                if (cMap.containsKey(cuisines[i])) {
                    cMap.get(cuisines[i]).add(foodITEM);
                } else {
                    PriorityQueue<FOOD> pq = new PriorityQueue<FOOD>(new Comparator<FOOD>() {
                        @Override
                        public int compare(FOOD a, FOOD b) {
                            int result = b.r - a.r;
                            if (result == 0) {
                                return (a.f).compareTo(b.f);
                            }
                            return result;
                        }
                    });

                    pq.add(foodITEM);
                    cMap.put(cuisines[i], pq);
                }
            }
        }

        public void changeRating(String food, int newRating) {
            FOOD prev = fMap.get(food);
            FOOD curr = new FOOD(food, prev.c, newRating);
            fMap.put(food, curr);
            prev.f = "";
            cMap.get(prev.c).add(curr);
        }

        public String highestRated(String cuisine) {
            while (cMap.get(cuisine).peek().f.equals("")) {
                cMap.get(cuisine).remove();
            }
            return cMap.get(cuisine).peek().f;
        }
    }
}
