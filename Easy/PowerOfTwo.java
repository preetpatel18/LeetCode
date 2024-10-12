package Easy;

public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if(n<=0){
            return false;
        }
        int i;
        for(i = 1;i <= n; i*=2){
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
