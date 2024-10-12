package Easy;

public class ShuffletheArray {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        int temp =0;
        for(int i = 0; i < n; i++, temp+=2){
            arr[temp] = nums[i];
        }
        temp=1;
        for(int i = n; i < nums.length; i++, temp+=2){
            arr[temp] = nums[i];
        }
        return arr;
    }
}
