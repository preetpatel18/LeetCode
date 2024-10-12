package Easy;

public class LargestOddNumberinString {
    public String largestOddNumber(String num) {
        if (Integer.parseInt(num.charAt(num.length() - 1) + "") % 2 != 0) {
            return num;
        }

        int k = -1;
        for (int i = 0; i < num.length(); i++) {
            int n = Integer.parseInt(num.charAt(i) + "");
            if (n % 2 != 0) {
                k = i;
                System.out.println(i);

            }
        }
        return num.substring(0, k + 1);
    }
}
