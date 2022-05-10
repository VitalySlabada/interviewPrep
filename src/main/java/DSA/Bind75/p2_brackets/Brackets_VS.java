package DSA.Bind75.p2_brackets;

import java.util.Stack;

public class Brackets_VS {

    public static void main(String[] args) {
        System.out.println(isValid("{{}}()"));
    }

    public static boolean isValid(String s) {
        char[] arr = s.toCharArray();

        Stack<Character> stack = new Stack<>();

        for (char each : arr) {
            if (each == '{' || each == '[' || each == '(') {
                stack.push(each);
                continue;
            } else {
                if (stack.isEmpty()) return false;
                char popChar = stack.pop();
                if ((popChar == '[' && each != ']') ||
                        (popChar == '{' && each != '}') ||
                        (popChar == '(' && each != ')')) return false;
            }
        }
        return stack.isEmpty();

    }
}
