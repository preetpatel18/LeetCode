package Easy;

public class Palindrome {
    public boolean isPalindrome(int x) {
    if (x < 0) {
        return false;
    }

    int original = x;
    int reverse = 0;

    while (x != 0) {
        reverse = reverse * 10 + x % 10;
        x /= 10;
    }

    return original == reverse;
    }
}
