package Medium;

import java.util.Arrays;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int[] LO = new int[128];
        Arrays.fill(LO, -1);

        int l = 0;
        for (int r = 0; r < n; r++) {
            char cC = s.charAt(r);
            if (LO[cC] >= l) {
                l = LO[cC] + 1;
            }
            LO[cC] = r;
            maxLength = Math.max(maxLength, r - l + 1);
        }

        return maxLength;
    }
}
