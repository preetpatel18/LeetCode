package Easy;
import java.util.*;
class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder lonPre = new StringBuilder();
        
        
        Arrays.sort(strs);
        String f = strs[0];
        String l = strs[strs.length-1];

        for(int i=0;i<f.length();i++){
            if(l.length()>i && l.charAt(i)==f.charAt(i)){
                lonPre.append(l.charAt(i));
            }else{
                return lonPre.toString();
            }
        }

        return lonPre.toString();
    }
}
