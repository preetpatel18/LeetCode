package Easy;

public class Base7 {
    public String convertToBase7(int num) {
        String s = "";
        if(num==0){
            return "0";
        }
        int r=0,d=Math.abs(num);
        while(d!=0){
            r = d%7;
            s+=r;
            d = d/7;
        } 
        StringBuilder sb = new StringBuilder(s);
        if(num < 0){
            return "-"+sb.reverse();
        }
        return sb.reverse()+"";
    }
}
