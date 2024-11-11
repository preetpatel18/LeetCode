package Easy;
public class BinarySearch {
    public int search(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length;
        while(lo < hi){
            int mid = lo + (hi - lo)/2;
            int cmp = nums[mid] - target;
            if (cmp == 0) return mid;
            if (cmp < 0) lo = mid+1;
            else hi = mid;
        }
        return -1;
    }
}