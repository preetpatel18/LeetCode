package Easy;

import java.util.Arrays;

public class FindTheDIfference {
    public char findTheDifference(String s, String t) {
        char[] cs = s.toCharArray();
        char[] ct = t.toCharArray();
        Arrays.sort(cs);
        Arrays.sort(ct);
        if(s.length()>t.length()){
            for(int i = 0; i < t.length(); i++){
                if(cs[i] != ct[i]){
                    return cs[i];
                }
            }
            return cs[cs.length-1];
        }else{
            for(int i = 0; i < s.length(); i++){
                if(cs[i] != ct[i]){
                    return ct[i];
                }
            }
            return ct[ct.length-1];

        }
    }
}
