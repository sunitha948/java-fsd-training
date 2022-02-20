package training_java;

import java.util.LinkedList;
import java.util.Queue;

public class Queuechar {
	public static void main(String[] args) {
		  Queue<Character> q=new LinkedList<>();
		  q.add('t');
		  q.add('a');
		  q.add('s');
		  q.add('t');
		  q.add('e');
		  System.out.print("Queue :"+q);
		  char removed=q.remove();
		  System.out.println("");
		  System.out.println("removed element: "+removed);
		  System.out.println("size of the queue is: "+q.size());
		  System.out.println("head of queue : "+q.peek());
		  System.out.println("is the queue is empty? "+q.isEmpty());
		  System.out.println("queue contains s ? "+q.contains('s'));
		  Queue<Character> q2=new LinkedList<>();
		  q2.add('y');
		  q2.add('z');
		  q.addAll(q2);
		  System.out.println("Queue after addAll: "+q);
		  q.clear();
		  System.out.println("is the queue is empty? "+q.isEmpty());
		  
	}
}
