package Lesson_1;

public class TaksOne {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int insert = m + n - 1;
        n = n - 1;
        m = m - 1;

        while (m >= 0 && n >= 0) {
            if (nums1[m] > nums2[n]) {
                nums1[insert] = nums1[m];
                m--;
            } else {
                nums1[insert] = nums2[n];
                n--;
            }
            insert--;
        }
        while (m >= 0) {
            nums1[insert--] = nums1[m--];
        }
        while (n >= 0) {
            nums1[insert--] = nums2[n--];
        }
    }
};



