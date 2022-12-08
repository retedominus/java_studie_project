package Lesson_4;
import java.util.Stack;
public class MyQueue {
    Stack<Integer> in;
    Stack<Integer> out;
    public MyQueue() {
        in = new Stack<>();
        out = new Stack<>();
    }
    public void push(int x) {
        while (!out.isEmpty()) {
            in.push(out.pop());
        }
        in.push(x);
    }
    public int pop() {
        while (!in.isEmpty()) {
            out.push(in.pop());
        }
        return out.pop();
    }
    public int peek() {
        while (!in.isEmpty()) {
            out.push(in.pop());
        }
        return out.peek();
    }
    public boolean empty() {
        return in.isEmpty() && out.isEmpty();
    }
    public static void main(String[] args) {
        MyQueue obj = new MyQueue();
        System.out.println(obj.empty());
        obj.push(1);
        obj.push(2);
        obj.push(3);
        System.out.println(obj.empty());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.empty());
    }
}
/*
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */

