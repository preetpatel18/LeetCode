package Easy;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int carry = 1;

        for (int i = n - 1; i >= 0; i--) {
            int currentSum = digits[i] + carry;
            digits[i] = currentSum % 10;
            carry = currentSum / 10;
        }

        if (carry > 0) {
            int[] result = new int[n + 1];
            result[0] = carry;
            System.arraycopy(digits, 0, result, 1, n);
            return result;
        }

        return digits;
    }
}
