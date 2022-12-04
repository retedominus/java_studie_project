package Lesson_3;

import java.util.ArrayList;
import java.util.List;

public class EquationBySelection {
    static List<List<Integer>> ans;

    public static void main(String[] args) {
        String equation = "?? + ?? = ???".replace(" ", "");
        char[] charArray = equation.toCharArray();
        List<Integer> qIndexes = new ArrayList<>();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == '?') {
                qIndexes.add(i);
            }
        }
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == '+') {
                charArray[i] = '=';
            }
        }

        List<List<Integer>> variables = new EquationBySelection().combine(qIndexes.size(), charArray, qIndexes);
        if (variables.toArray().length == 0) {
            System.out.println("Решений нет");
        }

    }

    public List<List<Integer>> combine(int length, char[] charArray, List<Integer> qIndexes) {
        ans = new ArrayList<>();
        helper(new ArrayList<>(), length, charArray, qIndexes);
        return ans;
    }

    public void helper(List<Integer> comb, int length, char[] charArray, List<Integer> qIndexes) {
        if (comb.size() == length) {
            check(comb, charArray, qIndexes);
            return;
        }
        for (int i = 0; i <= 9; i++) {
            comb.add(i);
            helper(comb, length, charArray, qIndexes);
            comb.remove(comb.size() - 1);
        }
    }

    public static void check(List<Integer> comb, char[] charArray, List<Integer> qIndexes) {
        for (int i = 0; i < qIndexes.size(); i++) {
            charArray[qIndexes.get(i)] = Character.forDigit(comb.get(i), 10);
        }

        String[] solution = String.valueOf(charArray).split("=");
        int a = Integer.parseInt(solution[0]);
        int b = Integer.parseInt(solution[1]);
        int c = Integer.parseInt(solution[2]);
        if (a + b == c) {
            ans.add(new ArrayList<>(comb));
            System.out.printf("%d + %d = %d", a, b, c);
            System.out.println();
        }
    }

}

