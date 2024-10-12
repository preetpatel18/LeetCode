package Easy;

public class FinalValueofVariableAfterPerformingOperations {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String i : operations) {
            if (i.indexOf("--") == -1) {
                x++;
            } else {
                x--;
            }
        }
        return x;
    }
}
