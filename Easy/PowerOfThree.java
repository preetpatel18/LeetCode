package Easy;

public class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        if(n<=0){
            return false;
        }
        int i;
        for(i = 1;i <= n; i*=3){
            if(i == n){
                return true;
            }if(i < 0){
                return false;
            }
            System.out.println(i);
        }
        return false;
    }
}
