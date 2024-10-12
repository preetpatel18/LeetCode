package Easy;

import java.util.Stack;

public class ClearDigits {
    public String clearDigits(String s) {
        Stack stk = new Stack();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (48 <= c && c <= 57) {
                stk.pop();
            } else {
                stk.push(c);
            }
        }
        StringBuilder result = new StringBuilder();
        while (!stk.isEmpty()) {
            result.append(stk.pop() + "");
        }

        return result.reverse().toString();
    }
}
