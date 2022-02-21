package training_java;
import java.util.Stack;
public class StackString {
   public static void main(String[] args) {
	Stack<String> stk=new Stack<>();
	System.out.println("Is the stack is empty "+stk.empty());
	stk.push("give");
	stk.push("respect");
	stk.push("take");
	stk.push("respect");
	System.out.println("the stack is :"+stk);
	stk.pop();
	System.out.println("is stack empty ? "+stk.empty());
	System.out.println("top of the stack is :"+stk.peek());
	System.out.println("position of respect is "+stk.search("respect"));
}
}
