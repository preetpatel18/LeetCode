package Easy;

public class ArrangingCoins {
    public int arrangeCoins(int n) {
        boolean b = true;
        int  i = 1;
        while(b){
            if(((n-i)>=0)){
                n-=i;
                i++;
            }else{
                b=false;
            }
        }
        return i-1;
    }
}