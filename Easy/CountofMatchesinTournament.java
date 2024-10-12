package Easy;

public class CountofMatchesinTournament {
    public int numberOfMatches(int n) {
        int temp = n;
        int matches = 0;
        int r = 0;
        while (temp != 1) {
            if (n % 2 == 0) {
                matches = n / 2;
                n /= 2;
            } else {
                matches = (n - 1) / 2;
                n = (n - 1) / 2 + 1;
            }
            r += matches;
            temp = n;
        }
        return r;
    }
}
