package Lesson_1;

public class TaskFive {
    public static boolean isPalindrome(String s) {
        int right = s.length() - 1;
        int left = 0;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) left++;
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) right--;
            char leftChar = Character.toLowerCase(s.charAt(left));
            char rightChar = Character.toLowerCase(s.charAt(right));
            if (leftChar != rightChar) return false;
            right--;
            left++;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(".,"));
    }
}
