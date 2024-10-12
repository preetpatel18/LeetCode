package Easy;

public class HappyNumber {
    public boolean isHappy(int n) {
        int l = getNum(n);
         if(l == 1) return true;
         return false;
     }
 
     public int getNum(int n){
         if(n == 1){
             return 1;
         }else if(n < 10 && (n%7 != 0) ){
             return -1;
         }else{
             return getNum(getSum(n));
         }
     }
 
     public int getSum(int n){
         int sum = 0;
         int temp = n;
         while(temp != 0){
             sum+=(int)(Math.pow(temp%10,2));
             temp/=10;
         }
         System.out.println(sum);
         return sum;
     }
}
