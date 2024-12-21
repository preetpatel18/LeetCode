package Easy;

import java.util.HashMap;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i< nums.length-1; i++){
            for(int j= i+1; j <= nums.length-1; j++){
                if(nums[i]+nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    // Faster Algorithm: Run time of O(n)
    public int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int difference =target - nums[i];
            int remainder = target - difference;
            if(hm.containsKey((Integer)remainder)){
                return new int[]{hm.get(remainder), i};
            }else{
                hm.put(difference, i);
            }
        }
        return null;
    }
}