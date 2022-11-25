package Lesson_1;

public class TaskFive {
    public static boolean isPalindrome(String s) {
        int right = s.length() - 1;
        for (int left = 0; left <= right; left++) {
            while (s.length() > 1 & left < s.length() - 1 && !Character.isLetterOrDigit(s.charAt(left))) left++;
            while (s.length() > 1 & right > 0 && !Character.isLetterOrDigit(s.charAt(right))) right--;
            if ((Character.isLetterOrDigit(s.charAt(left)) & Character.isLetterOrDigit(s.charAt(right))) &
                    (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right)))) return false;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(".,"));
    }
}
