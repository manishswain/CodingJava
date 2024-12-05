package Generics;

import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(1);
        stack.push(1);
        Integer removedElement = stack.pop();
        stack.peek();

        // LikedList can also used to implement stack
        // ArrayList can also be used to implement stack (but not preffered)
    }
}
