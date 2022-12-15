package Lesson_4;

import java.util.Deque;
import java.util.LinkedList;

public class SimplifyPath {
    static String entryData = "/a//b////c/d//././/..";

    public static String simplifyPath(String path) {
        StringBuilder sb = new StringBuilder();
        Deque<String> deque = new LinkedList<>();

        path = path.replaceAll("/+", "/");
        String[] fullPath = path.split("/");
        for (String dir : fullPath) {
            if ("..".equals(dir)) {
                if (!deque.isEmpty()) {
                    deque.pollLast();
                }
            } else if (!"".equals(dir) && !".".equals(dir)) {
                deque.addLast(dir);
            }
        }
        if (deque.isEmpty()) {
            return "/";
        }
        while (!deque.isEmpty()) {
            sb.append("/").append(deque.pollFirst());
        }

        return sb.toString();
    }


    public static void main(String[] args) {
        System.out.println(simplifyPath(entryData));
    }
}
