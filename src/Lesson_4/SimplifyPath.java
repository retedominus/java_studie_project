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
            if (dir.equals("")) {
                continue;
            }
            if (dir.equals(".")) {
                continue;
            }
            if (fullPath.length > 1 && dir.equals("..")) {
                deque.pollFirst();
            } else deque.push(dir);
        }
        while (!deque.isEmpty()) {
            sb.append("/");
            sb.append(deque.pollLast());
        }
        path = sb.toString();
        return path.isEmpty() ? "/" : path;
    }


    public static void main(String[] args) {
        System.out.println(simplifyPath(entryData));
    }
}
