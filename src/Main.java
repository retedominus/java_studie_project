public class Main {
    public static String addBinary(String a, String b) {
        if (a.length() > b.length()) {
            String t = a;
            a = b;
            b = t;
        }
        int i = a.length() - 1;
        int car = 0;
        StringBuilder sb = new StringBuilder();
        for (int j = b.length() - 1; j >= 0; j--) {
            if (b.charAt(j) == '1') {
                car++;
            }
            if (i >= 0 && a.charAt(i) == '1') {
                car++;
            }
            sb.append(car % 2);
            i--;
            car = car / 2;
        }
        if (car == 1) sb.append(car);
        return sb.reverse().toString();
    }

    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();

        int i = 0;

        while (i < word1.length() || i < word2.length()) {
            if (i < word1.length()) {
                sb.append(word1.charAt(i));
            }

            if (i < word2.length()) {
                sb.append(word2.charAt(i));
            }

            i++;
        }

        return sb.toString();
    }

}