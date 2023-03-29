package Lesson_4;

import java.util.HashMap;
import java.util.Map;

public class HashMapSet {
    public static void main(String[] args) {
        // HASHMAP / SET
        // быстрый доступ по ключу / ключ - значени
        // ключ - значение
        String text = "a a akkk kkkkk kkfff jiis fidfik jk ikik ";
        String[] textArray = text.split("\\s");
        Map<String, Integer> counter = new HashMap<>(); // доступ к ключу 0 (1)
        for (String word : textArray) {
//            if (!counter. containsKey (word)) {
//                counter.put (word, 1);
//            } else {
//                counter.put (word, counter. get (word) + 1);
            // при обновлении счетчика будьте уверены, что у вас такой ключ есть
//        }
            counter.putIfAbsent(word, 0);
            counter.put(word, counter.get(word) + 1);
        }
    }
}