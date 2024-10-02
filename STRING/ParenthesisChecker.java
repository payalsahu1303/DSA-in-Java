// Given an expression string x. Examine whether the pairs and the orders of {,},(,),[,] are correct in exp.

import java.util.Stack;

public class ParenthesisChecker {
    Stack<Character> stack = new Stack<>();

    boolean isOpening(char c) {
        return c == '(' || c == '[' || c == '{';
    }

    boolean isMatching(char a, char b) {
        return (a == '(' && b == ')') || (a == '{' && b == '}') || (a == '[' && b == ']');
    }

    public boolean checkParenthesis(String str) {
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (isOpening(current)) {
                stack.push(current);
            } else if (stack.isEmpty()) {
                return false;
            } else if (!isMatching(stack.peek(), current)) {
                return false;
            } else {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ParenthesisChecker obj = new ParenthesisChecker();
        String str = "[()]{}{[()()]()}";
        System.out.println(obj.checkParenthesis(str));
    }
}

// The time complexity is O(n) because the string is traversed once, and each
// character is processed in constant time. The space complexity is O(n) due to
// the stack.