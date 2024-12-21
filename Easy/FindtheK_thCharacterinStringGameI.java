package Easy;

public class FindtheK_thCharacterinStringGameI {
    public char kthCharacter(int k) {
        String word = "a";
        for(int i = 1; i <= k;i*=2){
            String creation="";
            for(int j = 0; j < word.length();j++){
                creation += (char)(word.charAt(j)+1);
            }
            word+=creation;
        }
        return word.charAt(k-1);
    }
}
