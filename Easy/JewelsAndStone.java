package Easy;

public class JewelsAndStone {
    public int numJewelsInStones(String jewels, String stones) {
        int s = 0;
        for(int i = 0 ;i<jewels.length();i++){
            for (int j = 0; j < stones.length();j++){
                if(jewels.charAt(i)==stones.charAt(j)){
                    s++;
                }
            }
        }   
        return s;
    }
}
