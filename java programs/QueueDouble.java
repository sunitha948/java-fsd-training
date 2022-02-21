package training_java;
import java.util.LinkedList;
import java.util.Queue;
public class QueueDouble {
   public static void main(String[] args) {
	  Queue<Double> q=new LinkedList<>();
	  q.add(12.23);
	  q.add(8.88);
	  q.add(34.56);
	  System.out.print("Queue :"+q);
	  double removed=q.remove();
	  System.out.println("removed element: "+removed);
	  System.out.println("size of the queue is: "+q.size());
	  System.out.println("head of queue : "+q.peek());
	  System.out.println("is the queue is empty? "+q.isEmpty());
	  System.out.println("queue contains 0.00 ? "+q.contains(0.00));
	  Queue<Double> q2=new LinkedList<>();
	  q2.add(67.89);
	  q.addAll(q2);
	  System.out.println("Queue after addAll: "+q);
	  q.clear();
	  System.out.println("is the queue is empty? "+q.isEmpty());
}
}
