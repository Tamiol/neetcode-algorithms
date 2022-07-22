import java.util.Stack;

public class ValidParentheses20 {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for(char a : s.toCharArray()){

            if(a == ')'){
                if(stack.empty() || stack.pop() != '(') return false;

            }else if(a == '}'){
                if(stack.empty() || stack.pop() != '{') return false;

            }else if(a == ']'){
                if(stack.empty() || stack.pop() != '[') return false;

            }else{
                stack.push(a);
            }
        }

        return stack.empty();
    }
}
