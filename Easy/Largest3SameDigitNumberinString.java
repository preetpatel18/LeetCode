package Easy;

public class Largest3SameDigitNumberinString {
    public String largestGoodInteger(String num) {
        int max =-1;
        for(int i = 1;i<num.length()-1;i++){
            char c_1 = num.charAt(i-1), c=num.charAt(i), c1=num.charAt(i+1);
            int combined = Integer.parseInt(num.substring(i-1,i+2));
            if(c_1 == c && c == c1){
                if(max  < combined){
                    max = combined;
                }
            }
        }
        if(max == 0){
            return "000";
        }else if(max == -1){
            return "";
        }

        return max+"";
    }
}
