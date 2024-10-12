package Easy;

public class FibonacciNumber {
    public int fib(int n) {
        if(n==0 || n==1){
            return n;
        }
        return f(n-1) + f(n-2);
    }
    public int f(int n){
        if(n==0 || n==1){
            return n;
        }else{
            return f(n-1)+f(n-2);
        }
    }
}
