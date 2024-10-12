package Easy;
import java.util.*;
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        if(Arrays.binarySearch(nums, target) >-1){
            return Arrays.binarySearch(nums, target);
        }
        
        int low=0;
        int high=nums.length-1;

        while(low<=high){
            int middlePo = (low+high)/2;
            int middleVal = nums[middlePo];
            if(target < middleVal){
                high = middlePo - 1;
            }else{
                low = middlePo + 1;
            }
        }


        return low;
    }
}
