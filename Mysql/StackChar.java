package training_java;
import java.util.Stack;
public class StackChar {
   public static void main(String[] args) {
	 Stack<Character> stk=new Stack<>();
	 System.out.println("Is the stack is empty "+stk.empty());
	 stk.push('a');
	 stk.push('Y');
	 stk.push('z');
	 stk.push('f');
	 stk.push('d');
	 System.out.print("character stack - "+stk);
	 stk.pop();
	 System.out.println("");
	 System.out.println("top of the stack is "+stk.peek());
	 System.out.println("Is the stack is empty?- "+stk.empty());
	 System.out.println("position of Y : "+stk.search('Y'));
}
}
