package training_java;

import java.util.LinkedList;
import java.util.Queue;

public class QueueString {
	public static void main(String[] args) {
		  Queue<String> q=new LinkedList<>();
		  q.add("hello");
		  q.add("Mr");
		  q.add("Ravuth");
		  System.out.print("Queue :"+q);
		  String removed=q.remove();
		  System.out.println("");
		  System.out.println("removed element: "+removed);
		  System.out.println("size of the queue is: "+q.size());
		  System.out.println("head of queue : "+q.peek());
		  System.out.println("is the queue is empty? "+q.isEmpty());
		  System.out.println("queue contains Ms ? "+q.contains("Ms"));
		  Queue<String> q2=new LinkedList<>();
		  q2.add("How");
		  q2.add("are");
		  q2.add("you");
		  q.addAll(q2);
		  System.out.println("Queue after addAll: "+q);
		  q.clear();
		  System.out.println("is the queue is empty? "+q.isEmpty());
	}
}
