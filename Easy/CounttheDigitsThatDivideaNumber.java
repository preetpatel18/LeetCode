package Easy;

public class CounttheDigitsThatDivideaNumber {
    public int countDigits(int num) {
        int s = 0;
        int f = num;
        while (num != 0) {
            int temp = num % 10;
            if (f % temp == 0) {
                s++;
            }
            num /= 10;

        }
        return s;
    }
}
