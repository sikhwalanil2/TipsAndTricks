import java.util.Stack;

public class TestClass {

    public static void main(String[] args) {
        char [] s = "{[]}".toCharArray();
        Stack<Character> stack = new Stack<>();
        boolean isValid =true;

        for(char c:s){
            if((c=='(') || (c=='{') | (c=='[')){
                stack.push(c);
            } else if((c ==')') && stack.pop()!='('){
                System.out.println("failed");
                isValid=false;
                break;
            }
            else if(c == '}' && stack.pop() !='{'){
                System.out.println("failed");
                isValid=false;
                break;
            }
            else if(c == ']' && stack.pop() !='['){
                System.out.println("failed");
                isValid=false;
                break;
            }

        }

        System.out.println(isValid);
    }
}
