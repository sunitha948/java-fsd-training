package training_java;
import java.util.*;
class Assgnmnt8three extends Exception {
	Assgnmnt8three(String s)
	{
	  super(s);
	}

	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.print("your answer is:");
	int value=sc.nextInt();
	
	  try
       {
    	 if(value==10)
    	 {
    		System.out.println("you won");
    	 }
    	 else
    	 {
    		throw new Assgnmnt8three("sorry! you loose!!");
    	 }
       }
	   catch(Assgnmnt8three e)
	  {
		   System.out.println(e.getMessage());
	  }
	}
}
