package Medium;

public class DifferenceBetweenOnesandZerosinRowandColumn {
    public int[][] onesMinusZeros(int[][] grid) {

        int[][] dif = new int[grid.length][grid[0].length];
        int[] ver = new int[grid[0].length];
        int[] hor = new int[grid.length];

        for (int i = 0; i < grid.length; i++) {
            int sum = 0;
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    sum++;
                }
            }
            hor[i] = sum;
        }

        for (int j = 0; j < grid[0].length; j++) {
            int sum = 0;
            for (int i = 0; i < grid.length; i++) {
                if (grid[i][j] == 1) {
                    sum++;
                }
            }
            ver[j] = sum;
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                int oneV = ver[j];
                int oneH = hor[i];
                int zeroV = grid[i].length - ver[j];
                int zeroH = grid.length - hor[i];
                dif[i][j] = oneH + oneV - zeroV - zeroH;
            }
        }
        System.gc();
        return dif;
    }
}
