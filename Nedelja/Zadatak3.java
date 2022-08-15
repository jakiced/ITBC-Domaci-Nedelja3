package Wk3.Nedelja;

import java.util.Stack;

public class Zadatak3 {

    static boolean isValid(String string) {
        Stack<Character> parentheses = new Stack<>();

        for (char c : string.toCharArray()) {
            switch (c) {
                case '(':
                    parentheses.push(c);
                    break;
                case '{':
                    parentheses.push(c);
                    break;
                case '[':
                    parentheses.push(c);
                    break;
                case ')':
                    if (parentheses.empty() || parentheses.peek() != '(')
                        return false;
                    else
                        parentheses.pop();
                    break;
                case '}':
                    if (parentheses.empty() || parentheses.peek() != '{')
                        return false;
                    else
                        parentheses.pop();
                    break;
                case ']':
                    if (parentheses.empty() || parentheses.peek() != '[')
                        return false;
                    else
                        parentheses.pop();
                    break;
                default:
            }
        }
        return parentheses.isEmpty();
    }
    public static void main(String[] args) {
        String str = "[{}({})]";

        System.out.println(isValid(str));
    }
}
