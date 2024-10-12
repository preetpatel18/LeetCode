package Easy;

public class AddStrings {
    public String addStrings(String num1, String num2) {
        if(num1.length()<=1 && num2.length()<=1){
            int n1 = num1.charAt(0)-'0';
            int n2 = num2.charAt(0)-'0';
            return n1+n2+"";
        }
        System.out.println( num1.length()-num2.length());
        String ret = "";
        String s = "";
        if(num1.length()<num2.length()){
            for(int i = 0 ; i < num2.length()-num1.length();i++){
                s+="0";
            }
            num1= s+num1;
        }else if(num1.length()>num2.length()){
            for(int i = 0 ; i < num1.length()-num2.length();i++){
                s+="0";
            }
            num2 = s + num2;
        }
        System.out.println(num1 +" " + num2);
        int remainder = 0;
        for(int i = num1.length()-1; i > 0; i--){
            int n1 = num1.charAt(i)-'0';
            int n2 = num2.charAt(i)-'0';
            ret = (n1+n2+remainder)%10+ret;
            if((n1+n2+remainder)>9){
                remainder = (n1+n2+remainder)/10;
            }else{
                remainder = 0;
            }
        }
        int n1 = num1.charAt(0)-'0';
        int n2 = num2.charAt(0)-'0';
        ret = n1+n2+remainder+ret;
        return ret;
    }
}
