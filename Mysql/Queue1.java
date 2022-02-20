package training_java;
import java.util.LinkedList;
import java.util.Queue;
public class Queue1 {
	
		public static void main(String[] args)
		{
				Queue<Integer> q= new LinkedList<>();	
	            
	            for (int i = 0; i < 5; i++)
	            	q.add(i);
	            System.out.println("Elements of queue "+ q);
	                           
	            int removedele = q.remove();
	            System.out.println("removed element- "+ removedele);
	                           
	            System.out.println(q);
	            int head = q.peek();
	            System.out.println("head of q-" +head);
	            int size = q.size();
	            System.out.println("Size of queue-"+ size);
	            System.out.println("is the queue is empty? "+q.isEmpty());               
	            Queue<Integer> q2=new LinkedList<>();
	            q2.add(6);
	            q2.add(7);
	            q.addAll(q2);
	            System.out.println("queue after addAll is "+q);
	            if(q.contains(5))
	            {
	            	System.out.println("5 is in the queue");
	            }
	            else {
	               System.out.println("5 is not there in the queue");
	            }
	            q.clear();
	            System.out.println("queue after clear "+q);
	            System.out.println("is the queue empty? "+q.isEmpty());
		}
	}



