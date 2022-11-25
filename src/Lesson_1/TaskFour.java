package Lesson_1;

public class TaskFour {
    public static String reverseWords(String s) {
        s = s.trim();
        int last = s.length() - 1;
        StringBuilder sb = new StringBuilder();
        for (int first = last; first >= 0; first--) {
            if (first == 0 || (s.charAt(first - 1) == ' ' && s.charAt(first) != ' ')) {
                sb.append(s, first, last + 1);
                if (first != 0)
                    sb.append(" ");
                last = first - 1;
                while (last >= 0 && s.charAt(last) == ' ')
                    last--;
            }
        }
        s = sb.toString();
        return s;
    }

    public static void main(String[] args) {
        String res = reverseWords("  hello world  ");
        System.out.println(res);
    }
}







