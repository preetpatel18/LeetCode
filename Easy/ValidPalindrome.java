package Easy;

import java.util.ArrayList;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        char[] c = s.toCharArray();
        ArrayList<Character> ch = new ArrayList<>();

        for(char i:c){
            boolean b1 = (i >= 'A' && i <= 'Z');
            boolean b2 = (i >= 'a' && i <= 'z');
            boolean b3 = (i >= '0' && i <= '9');
            if(b1 || b2 || b3){
                ch.add(i);
            }
        }
        String nor = "";
        String rev = "";
        for(int i = 0; i < ch.size();i++){
            nor += ch.get(i)+"";
        }
        StringBuilder sb = new StringBuilder(nor);
        rev = sb.reverse()+"";
        nor  = nor.toLowerCase();
        rev = rev.toLowerCase();
        return rev.equals(nor);
    }
}
