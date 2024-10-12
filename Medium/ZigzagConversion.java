package Medium;

public class ZigzagConversion {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        String[] arr = new String[numRows];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = "";
        }
        int temp2 = 0;

        while (temp2 < s.length()) {
            for (int i = 0; (i < numRows && temp2 < s.length()); i++, temp2++) {
                arr[i] += (s.charAt(temp2) + "");
            }
            for (int i = numRows - 2; (i > 0 && temp2 < s.length()); i--, temp2++) {
                arr[i] += (s.charAt(temp2) + "");
            }
        }
        String out = "";
        for (String i : arr) {
            System.out.println(i);
            out += i;
        }
        return out;
    }
}
