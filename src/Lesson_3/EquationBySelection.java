package Lesson_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EquationBySelection {
    static String equation = "2? + ?5 = 69";
    static List<Integer> combinations = new ArrayList<>();


    public static void main(String[] args) {
        System.out.println(equationBySelection(equation));
    }

    public static String equationBySelection(String arg) {
        char[] charArray = arg.replaceAll("\\s", "").toCharArray();
        List<Integer> indexes = new ArrayList<>();
        String[] solution;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == '?') indexes.add(i);
        }

        helper(new ArrayList<>(), indexes.size());
        for (int i = 0; i < indexes.size(); i++) {
            charArray[indexes.get(i)] = Character.forDigit(combinations.get(i), 10);
        }
        solution = Arrays.toString(charArray).replaceAll("\\+", "=").split("=");
        if (Integer.parseInt(solution[1]) + Integer.parseInt(solution[2]) == Integer.parseInt(solution[3])) {

        }

        return Arrays.toString(solution);

    }

    public static void helper(List<Integer> tmp, int length) {
        if (tmp.size() == length) {
            combinations = tmp;
            return;
        }
        for (int i = 0; i <= 9; i++) {
            tmp.add(i);
            helper(tmp, length);
            tmp.remove(tmp.size() - 1);
        }
    }

}

