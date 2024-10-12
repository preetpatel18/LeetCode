package Easy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> t = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        if (rowIndex == 0) {
            return firstRow;
        }
        t.add(firstRow);
        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> pR = t.get(i - 1);
            List<Integer> cR = new ArrayList<>();
            cR.add(1);
            for (int j = 1; j < i; j++) {
                long sum = (long) pR.get(j - 1) + pR.get(j);
                cR.add((int) sum);
            }
            cR.add(1);
            t.add(cR);
        }
        return t.get(t.size()-1);
    }
}
