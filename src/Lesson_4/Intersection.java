package Lesson_4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Intersection {
    public static int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) { //меняем местами массивы, чтобы на первом месте всегда был наименьший
            return intersection(nums2, nums1);
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        List<Integer> intersect = new ArrayList<>();
        for (int num : nums2) {
            if (set.contains(num)) {
                intersect.add(num);
                set.remove(num);
            }
        }
        int[] outarr = new int[intersect.size()];
        for (int i = 0; i < outarr.length; i++) {
            outarr[i] = intersect.get(i);
        }
        return outarr;
    }
}

