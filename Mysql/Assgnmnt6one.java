package training_java;
import java.util.*;
public class Assgnmnt6one {
	public static void main(String[] args)
	{
      Scanner sc=new Scanner(System.in);
      System.out.println("enter first string :");
      String str1=sc.nextLine();
      System.out.println("enter second string:");
      String str2=sc.nextLine();
      boolean result=(str1.contains(str2));
      if(result)
      {
    	  System.out.println("substring is present in the string");
      }
      else
        System.out.println("substring is not present in the string");
	}
}
