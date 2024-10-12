package Medium;

public class MaximumIceCreamBars {
    public int maxIceCream(int[] costs, int coins) {
        java.util.Arrays.sort(costs);
        int n = 0;
        int t = 0;
        for (int i : costs) {
            if (n + i <= coins) {
                n = n + i;
                t++;
            }
        }
        return t;
    }
}
