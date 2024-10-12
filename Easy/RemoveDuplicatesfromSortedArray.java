package Easy;
import java.util.ArrayList;

public class RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(nums[0]);
        for(int i = 1;i <nums.length;i++){
            if(temp.get(temp.size()-1) != nums[i]){
                temp.add(nums[i]);
            }
        }
        for(int i = 0; i < nums.length;i++){
            if(i<temp.size()){
                nums[i] = temp.get(i);
            }
        }
        return temp.size();
    }
}
