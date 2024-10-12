package Easy;

class RomanToInteger {
    public int romanToInt(String s) {
        int total=0;
        char[] c = s.toCharArray();
        for(int i = 0; i < c.length;i++){
            if(i==c.length-1){
                total+=value(c[i]);
            }else{
                if(value(c[i]) >= value(c[i+1])){
                    total+=value(c[i]);
                }else{
                    total-=value(c[i]);
                }
            }
        }
        return total;
    }

    public int value(char A){
        switch(A){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            default: return 1000;
        }
    }
}