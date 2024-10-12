package Easy;

public class NumberOf1Bits {
    public int hammingWeight(int n) {
        System.out.println(Integer.toBinaryString(n));
        String s = Integer.toBinaryString(n);
        int r =0;
        for(int i = 0 ; i < s.length();i++){
            if(s.charAt(i) != '0'){
                r++;
            }
        }
        return r;
    }
}
