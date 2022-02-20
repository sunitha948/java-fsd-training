package training_java;
import java.util.*;
public class Assgnmnt4three {
   public static void main(String[] args)
   {
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Number of classes held :");
	   int a=sc.nextInt();
	   System.out.print("Number of classes attended :");
	   int b=sc.nextInt();
	   double percentage = (b*100)/a;
	   System.out.println("percentage of class attended="+percentage+"%");
	   if(percentage>=75)
	   {
		   System.out.println("Student is allowed to attend exam");
	   }
	   else
	   {
		   System.out.println("Student is not allowed to attend exam");
	   }
   }
}
