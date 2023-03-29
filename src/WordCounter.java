import java.util.HashMap;
import java.util.Map;

public class WordCounter {


    public static void main(String[] args) {
        String input = "Россия идет вперед всей планеты. Планета — это не Россия.";
        Map<String, Integer> wordCount = countWords(input);
        System.out.println(wordCount);
    }

    public static Map<String, Integer> countWords(String input) {
        Map<String, Integer> wordCount = new HashMap<>();
        String[] words = input.split("\\s+");
        for (String word : words) {
            word = word.toLowerCase().replace(".", "");
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }
        return wordCount;
    }
}


