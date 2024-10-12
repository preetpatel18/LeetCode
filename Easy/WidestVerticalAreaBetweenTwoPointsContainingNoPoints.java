package Easy;

import java.util.Arrays;

public class WidestVerticalAreaBetweenTwoPointsContainingNoPoints {
    public int maxWidthOfVerticalArea(int[][] points) {
        int max = 0;
        int[] a = new int[points.length];
        for (int i = 0; i < points.length; i++) {
            a[i] = points[i][0];
        }
        Arrays.sort(a);
        for (int i = 0; i < a.length - 1; i++) {
            if ((int) Math.abs(a[i + 1] - a[i]) > max) {
                max = (int) Math.abs(a[i + 1] - a[i]);
            }
        }
        return max;
    }
}
