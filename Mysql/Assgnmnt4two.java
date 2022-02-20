package training_java;
import java.util.*;
public class Assgnmnt4two {
      public static void main(String[] args)
      {
    	  System.out.println("enter a number");
    	  Scanner sc = new Scanner(System.in);
    	  int num=sc.nextInt();
    	  System.out.println("Multiplication Table");
    	  for(int i=1;i<11;i++)
    	  {
    		
    		  System.out.println(num*i);
    	  }
      }
}
