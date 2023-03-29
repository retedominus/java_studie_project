package Lesson_4;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int val = target - nums[i];
            if (map.containsKey(val)) {
                return new int[] {map.get(val), 1};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}

