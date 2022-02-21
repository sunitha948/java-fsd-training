package training_java;
import java.util.*;
public class Assgnmnt12one {
   public static void main(String[] args)
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter the limit");
	   int limit=sc.nextInt();
	  int prev=0;
	   int present=1;
	   int next=(prev+present);
	   System.out.println(prev);
	   System.out.println(present);
	  
	   while(next<=limit)
	   {
		   System.out.println(next);
		   prev=present;
		   present=next;
		   next=prev+present;
		  
		   
		  
		   
	   }
   }
}
