import java.util.Stack;

public class PushAtBottom {

   
    public static void pushAtBottom(Stack<Integer> stack, int data) {
        
        if (stack.isEmpty()) {
            stack.push(data);
            return;
        }

        
        int top = stack.pop();

        
        pushAtBottom(stack, data);

        
        stack.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Original Stack: " + stack);

        pushAtBottom(stack, 0);

        System.out.println("After pushing at bottom: " + stack);
    }
}
