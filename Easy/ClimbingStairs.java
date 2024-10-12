package Easy;

public class ClimbingStairs {
    public int climbStairs(int n) {
        return getFebo(n);
    }
    /*********
    * TRIAL-2
    **********/
    public static int getFebo(int n){
        int a = 0;
        int b = 1;
        int c = 0; 
        for(int i = 0; i < n;i++){
            c = a+b;
            a=b;
            b=c;
        }
        return c;
    }

    /******************************************
    // Trial 1: This Method is TOO slow. 31/45
    *******************************************/
    public static int getFebo2(int n){
        if(n<=1){
            return 1;
        }
        return getFebo(n-1)+getFebo(n-2);
    }
}
