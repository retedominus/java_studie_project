package Lesson_1;

public class TaksOne {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int insert = m + n - 1;
        int si = n - 1;
        int fi = m - 1;

        while (fi >= 0 && si >= 0) {
            if (nums1[fi] > nums2[si]) {
                nums1[insert] = nums1[fi];
                fi--;
            } else {
                nums1[insert] = nums2[si];
                si--;
            }
            insert--;
        }
        while (fi >= 0) {
            nums1[insert--] = nums1[fi--];
        }
        while (si >= 0) {
            nums1[insert--] = nums2[si--];
        }
        return;
    }
};



