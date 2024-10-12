package Medium;

public class MultiplyStrings {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        int n = num1.length();
        int m = num2.length();
        int[] result = new int[n + m];

        for (int i = n - 1; i >= 0; i--) {
            int x = num1.charAt(i) - '0';
            for (int j = m - 1; j >= 0; j--) {
                int y = num2.charAt(j) - '0';
                int product = x * y;
                int sum = product + result[i + j + 1];
                result[i + j] += sum / 10;
                result[i + j + 1] = sum % 10;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int value : result) {
            if (!(sb.length() == 0 && value == 0)) {
                sb.append(value);
            }
        }
        return sb.toString();
    }
}
