package org.bulatnig.braces;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Hello world!
 */
public class App {

    public boolean check(String text) {
        char[][] brackets = new char[][]{{'(', ')'}, {'[', ']'}, {'{', '}'}};
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : text.toCharArray()) {
            for (char[] bracket : brackets) {
                char openBracket = bracket[0];
                char closeBracket = bracket[1];
                if (openBracket == c) {
                    stack.push(c);
                } else if (closeBracket == c) {
                    if (stack.isEmpty() || stack.peek() != openBracket) {
                        return false;
                    } else {
                        stack.pop();
                    }
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
