package Easy;

public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        int temp = 1;
        while(num > 0){
            num-=temp;
            temp+=2;
        }
        if(num == 0){
            return true;
        }else{
            return false;
        }
    }
}
