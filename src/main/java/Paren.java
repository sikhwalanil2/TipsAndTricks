import java.util.Stack;

public class Paren {

    public static void main(String[] args) {
        Stack<Character> ss= new Stack<>();
        String s ="[{}]";
        boolean isVAlid = true;

        for (int i=0;i<s.length();i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[') {

                ss.push(s.charAt(i));
            } else if (s.charAt(i) == ')') {
                if (ss.pop() != '(') {
                    isVAlid = false;                    break;
                }
            } else if (s.charAt(i) == '}') {
                if (ss.pop() != '{') {
                    isVAlid = false;                    break;
                }
            } else if (s.charAt(i) == ']') {
                if (ss.pop() != '[') {
                    System.out.println("false");
                    isVAlid = false;
                    break;
                }
            }
        }
        System.out.println(isVAlid);

    }
}
