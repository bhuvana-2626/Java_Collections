package Stacks;

import java.util.Stack;

public class Valid_Paranthesis {
    public static boolean isvalid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '[' || ch == '{' || ch == '(') {
                st.push(ch);
            } else {
                if (st.isEmpty()) {
                    return false;
                }
                char top = st.pop();
                if ((ch == '{' && top != '}') || (ch == '[' && top != ']') || (ch == '(' && top != ')')) {
                    return false;
                }
            }
        }
        return st.isEmpty();

    }

    public static void main(String args[]) {
        String s1 = "{{[(]}}";
        String s2 = "{[]}()";
        System.out.println("Is s1 valid paranthesis?" + isvalid(s1));
        System.out.println("Is s2 valid paranthesis?" + isvalid(s2));
    }
}
