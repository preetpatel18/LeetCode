package Easy;

public class BuildArrayfromPermutation {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int nu = nums[i];
            int k = nums[nu];
            ans[i] = k;
        }
        return ans;
    }
}
