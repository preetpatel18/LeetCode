package Easy;
import java.util.*;
public class PascalsTriangle {
    class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> t = new ArrayList<>();
        if (numRows == 0) {
            return t;
        }
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        t.add(firstRow);
        for (int i = 1; i < numRows; i++) {
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
        return t;
    }
}
}
