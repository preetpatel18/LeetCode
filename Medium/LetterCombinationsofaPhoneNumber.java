package Medium;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsofaPhoneNumber {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }
        generateCombinations(result, new StringBuilder(), digits, 0);
        return result;
    }

    public void generateCombinations(List<String> result, StringBuilder current, String digits, int index) {
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }
        String letters = getString(Integer.parseInt(digits.charAt(index) + ""));
        for (int i = 0; i < letters.length(); i++) {
            current.append(letters.charAt(i));
            generateCombinations(result, current, digits, index + 1);
            current.deleteCharAt(current.length() - 1);
        }
    }

    public String getString(int num) {
        switch (num) {
            case (2):
                return "abc";
            case (3):
                return "def";
            case (4):
                return "ghi";
            case (5):
                return "jkl";
            case (6):
                return "mno";
            case (7):
                return "pqrs";
            case (8):
                return "tuv";
            default:
                return "wxyz";
        }
    }
}
