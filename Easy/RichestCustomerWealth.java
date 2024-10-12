package Easy;

public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] i : accounts) {
            int s = 0;
            for (int j : i) {
                s += j;
            }
            if (max < s) {
                max = s;
            }
        }
        return max;
    }
}
