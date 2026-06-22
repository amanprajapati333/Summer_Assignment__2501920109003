package Week_3.Day_3;

import java.util.Stack;

public class Task1 {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {

            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if (c == ')' && top != '(') {
                    return false;
                }
                if (c == '}' && top != '{') {
                    return false;
                }
                if (c == ']' && top != '[') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "()[]{}";
        Task1 obj = new Task1();
        obj.isValid(s);

    }
}
