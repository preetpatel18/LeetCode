package Easy;

public class AddDigits {
    public int addDigits(int num) {
        return add(num);
    }

    public int add(int n){
        int temp = n;
        int result = 0;
        while(temp != 0){
            int tp = temp%10;
            result += tp;
            temp/=10;
        }
        if(result > 9){
            return add(result);
        }
        return result;
    }
}
