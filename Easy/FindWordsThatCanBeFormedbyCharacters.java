package Easy;
import java.util.*;
public class FindWordsThatCanBeFormedbyCharacters {
    public int countCharacters(String[] words, String chars) {
        int sum = 0;
        for(int i = 0; i < words.length; i++){
            ArrayList<Character> ch = new ArrayList<>();
            for (char c : chars.toCharArray()) {
                ch.add(c);
            }
            int b = 0;
            ODD: for(int k = 0;k < words[i].length();k++){
                for(int j = ch.size()-1; j >=0; j--){
                    if(words[i].charAt(k) == ch.get(j)){
                        b++;
                        ch.remove(j);
                        continue ODD;
                    }
                }
            }
            if(b == words[i].length()){
                sum+=b;
            }
            System.out.println(ch);
        }

        return sum;
    }
}