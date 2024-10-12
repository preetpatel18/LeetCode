package Hard;

import java.util.Arrays;

public class MedianofTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] n = new int[nums1.length + nums2.length];
        int temp = 0;
        for (int i : nums1) {
            n[temp] = i;
            temp++;
        }
        for (int i : nums2) {
            n[temp] = i;
            temp++;
        }
        Arrays.sort(n);
        for (int i : n) {
            System.out.print(i);
        }
        boolean b = (n.length % 2 == 0);
        int t2 = b ? n.length / 2 - 1 : n.length / 2;
        if (b) {
            return (n[t2] + n[(n.length / 2)]) / 2.0;
        } else {
            return n[t2];
        }
    }
}
