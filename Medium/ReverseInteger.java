package Medium;

public class ReverseInteger {
    public int reverse(int x) {
        long n = 0;
        StringBuilder sb = new StringBuilder(x + "");
        String s = sb.reverse() + "";
        if (s.contains("-")) {
            n = -Long.parseLong(s.substring(0, s.length() - 1));
        } else {
            n = Long.parseLong(s.substring(0, s.length()));
        }
        if (n > Integer.MAX_VALUE || n < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) n;
    }
}
