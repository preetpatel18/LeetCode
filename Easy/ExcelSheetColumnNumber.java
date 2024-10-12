package Easy;

import java.util.Arrays;

public class ExcelSheetColumnNumber {
    public int titleToNumber(String columnTitle) {
        String[] s = new String[26];
        for(int i = 0 ; i < 26;i++){
            s[i]= (char)(i+65)+"";
        }

        int result = 0;
        for(int i =0;i<columnTitle.length();i++){
            result += (Arrays.binarySearch(s, (columnTitle.charAt(i)+""))+1)*(Math.pow(26,columnTitle.length()-i-1));
        }
        return result;
    }
}
