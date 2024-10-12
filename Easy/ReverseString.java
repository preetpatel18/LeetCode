package Easy;

public class ReverseString {
    public void reverseString(char[] s) {
        String ch = "";
        for(int i = s.length-1;i>=0;i--){
            ch+=""+s[i];
        }
        System.out.println(ch);
        char[] temp = ch.toCharArray();
        int index = 0;
        for(char i:temp){
            s[index] = i;
            index++;
        }
    }
}
