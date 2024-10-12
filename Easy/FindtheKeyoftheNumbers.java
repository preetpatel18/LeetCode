package Easy;

public class FindtheKeyoftheNumbers {
    public int generateKey(int num1, int num2, int num3) {
        String str1 = String.format("%04d", num1);
        String str2 = String.format("%04d", num2);
        String str3 = String.format("%04d", num3);
        StringBuilder key = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            char d1 = str1.charAt(i);
            char d2 = str2.charAt(i);
            char d3 = str3.charAt(i);
            char smallestDigit = (char) Math.min(Math.min(d1, d2), d3);
            key.append(smallestDigit);
        }
        return Integer.parseInt(key.toString());
    }
}
