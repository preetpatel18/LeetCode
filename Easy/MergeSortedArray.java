package Easy;
import java.util.*;
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int temp = 0;
        for(int i = m; i < m+n ; i ++, temp++){
            nums1[i] = nums2[temp];
        }
        Arrays.sort(nums1);
    }   
}
