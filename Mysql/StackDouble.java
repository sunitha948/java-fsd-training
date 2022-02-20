package training_java;
import java.util.Stack;
public class StackDouble {
    public static void main(String[] args) {
		Stack<Double> stk=new Stack<>();
		boolean result=stk.empty();
		System.out.println("is the stack empty - "+result);
		System.out.println("input the stack elements");
		stk.push(3.67);
		stk.push(4.44);
		stk.push(2.0);
		System.out.println("stack elements are:"+stk);
		stk.pop();
		System.out.println("top element is"+stk.peek());
		System.out.println(stk.empty());
		System.out.println("Is position of the element 4.44 is "+stk.search(4.44));
		 
	}
}
