package Easy;

public class sqrtX {
    public int mySqrt(int x) {
        if(x==0 || x==1){
            return x;
        }
        double t;
        double sqrt=x/2;
        do{
            t=sqrt;
            sqrt=(t+(x/t))/2;
        }while((t-sqrt)!= 0);
        return (int)(sqrt); 
    }
}
