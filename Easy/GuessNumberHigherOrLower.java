package Easy;

public class GuessNumberHigherOrLower {
    public int guessNumber(int n) {
        int min = 0;
        int max = n;
        while(min<=max){
            int middle = min + (max-min) / 2;
            if(guess(middle) == 0){
                return middle;
            }else if(guess(middle) == -1){
                max = middle-1;
            }else if(guess(middle) == 1){
                min = middle+1;
            }
        }
        return -1;
    }


    // IGNORE THIS METHOD.
    public int guess(int num){
        return 0;
    }
}
