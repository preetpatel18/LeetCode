package Easy;

public class CalculateMoneyinLeetcodeBank {
    public int totalMoney(int n) {
        int temp = 1;
        int temp2 = 2;
        int r = 0;
        for (int i = 1; i <= n; i++) {
            r += temp;
            temp++;
            if (i % 7 == 0) {
                temp = temp2;
                temp2++;
            }

            System.out.print(temp + "+");
        }
        return r;
    }
}
