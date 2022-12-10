package Lesson_5;

import java.util.*;

public class ArrayIntersection {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }

        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> inter = new ArrayList<>();

        for (int num : nums1) {
            map.putIfAbsent(num, 0);
            map.put(num, map.get(num) + 1);
        }
        for (int num : nums2) {
            if (map.containsKey(num)) {
                inter.add(num);
                map.put(num, map.get(num) - 1);
                if (map.get(num) == 0) {
                    map.remove(num);
                }
            }
        }
        int[] ans = new int[inter.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = inter.get(i);
        }
        return ans;
    }
}
