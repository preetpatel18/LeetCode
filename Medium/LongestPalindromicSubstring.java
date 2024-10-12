package Medium;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        int l, r;
        int start = 0, end = 0;
        int max = -1;
        int len = s.length();
        int TLen;
        if (len <= 1) {
            return s;
        }
        for (int i = 0; i < len - 1; ++i) {
            l = i;
            r = i;
            while (l >= 0 && r < len) {
                if (s.charAt(l) == s.charAt(r)) {
                    l--;
                    r++;
                } else {
                    break;
                }
            }

            TLen = r - l - 1;
            if (TLen > max) {
                max = TLen;
                start = l + 1;
                end = r - 1;
            }
        }
        for (int i = 0; i < len - 1; ++i) {
            l = i;
            r = i + 1;
            while (l >= 0 && r < len) {
                if (s.charAt(l) == s.charAt(r)) {
                    l--;
                    r++;
                } else {
                    break;
                }
            }

            TLen = r - l - 1;
            if (TLen > max) {
                max = TLen;
                start = l + 1;
                end = r - 1;
            }
            System.out.println("------");
            System.out.println(TLen);
            System.out.println("------");
        }

        System.out.println(max);
        System.out.println(start);
        System.out.println(end);
        return s.substring(start, end + 1);
    }
}