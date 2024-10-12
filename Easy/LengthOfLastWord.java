package Easy;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        String p1 = s.substring(s.lastIndexOf(" ")+1);
        return p1.length();
    }
}
