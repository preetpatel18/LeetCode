package Easy;

public class SubtracttheProductandSumofDigitsofanInteger {
    public int subtractProductAndSum(int n) {
        int result = 0;
        int result2 = 1;
        while(n != 0){
            int tp = n%10;
            result += tp;
            result2 *= tp;
            n/=10;
        }
        return result2-result;
    }

}
