package Easy;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int[] a = new int[nums.length];
        int counter =0;
        for(int i = 0 ; i < nums.length; i++){
            if(nums[i] != val){
                a[counter] = nums[i];
                counter++;
            }
        }
        for(int i = 0 ;i < a.length;i++){
            nums[i] = a[i];
        }
        return counter;
    }
}
