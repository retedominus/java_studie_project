package OOP_Lesson_1;

import java.util.Map;

public class Relatives implements GenTree{
    static String son;
    static String daughter;
    static String father;
    static String mother;

    static {
        son = "является сыном";
        daughter = "является дочерью";
        father = "является отцом";
        mother = "является матерью";
    }

    @Override
    public Map<String, String> setRelation(Map<String, String> genTree) {
    return null;
    }

    public static String getSon() {
        return son;
    }

    public static String getDaughter() {
        return daughter;
    }

    public static String getFather() {
        return father;
    }

    public static String getMother() {
        return mother;
    }
}
