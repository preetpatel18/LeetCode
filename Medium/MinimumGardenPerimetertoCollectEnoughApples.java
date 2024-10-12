package Medium;

public class MinimumGardenPerimetertoCollectEnoughApples {
    public static long minimumPerimeter(long neededApples) {
        long left = 1, right = 100000, middle;
        while (left < right) {
            middle = (left + right) / 2;
            if ((4 * Math.pow(middle, 3)) + (6 * Math.pow(middle, 2)) + (2 * middle) >= neededApples) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }
        return left * 8;
    }
}
