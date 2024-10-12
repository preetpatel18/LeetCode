package Easy;

public class FindtheIndexoftheFirstOccurrenceinaString {
    public int strStr(String haystack, String needle) {
        int size = needle.length();
        for(int i = 0; i <= haystack.length()-size; i++){
            if(haystack.substring(i, i+size).equals(needle)){
                return i;
            }
        }
        return -1;
    }
    // Cheating:  Alternate Solution
    public int strStr2(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
