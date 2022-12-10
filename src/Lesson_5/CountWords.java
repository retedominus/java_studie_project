package Lesson_5;

import java.util.HashMap;
import java.util.Map;

public class CountWords {
    public static int countWords(String[] words1, String[] words2) {
        if (words1.length > words2.length) {
            return countWords(words2, words1);
        }
        Map<String, Integer> map = new HashMap<>();
        for (String value : words1) {
            map.putIfAbsent(value, 0);
            map.put(value, map.get(value) + 1);
        }

        int ans = 0;
        for (String s : words2) {
            if (map.containsKey(s) && map.get(s) < 2) {
                map.put(s, map.get(s) - 1);
            }
        }
        for (var e : map.entrySet()) {
            if (e.getValue() == 0)
                ans++;

        }
        return ans;
    }

    public static void main(String[] args) {
        String[] words1 = {"leetcode", "is", "amazing", "as", "is"};
        String[] words2 = {"amazing", "leetcode", "is"};
        System.out.println(countWords(words1, words2));
    }
}

