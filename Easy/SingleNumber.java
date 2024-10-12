package Easy;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        boolean b = false;
        boolean[] n = new boolean[nums.length];
        for(int i = 0; i < nums.length;i++){
            int k = nums[i];
            b = false;
            //System.out.println(i);
            INNER: for(int j = i+1; j < nums.length; j++){
                //System.out.println(n[i] +" "+j);
                if(!n[i]){
                    if(k == nums[j]){
                        b = true;
                        n[j] = true;
                       // System.out.println(nums[j]+"-"+j+"+"+n[j]);
                        break INNER;
                    }
                }
            }
            //System.out.println(b);
            if(!n[i] && !b){
                return k;
            }
        }

        return nums[0];
    }
}
