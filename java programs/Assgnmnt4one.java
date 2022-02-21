package training_java;
import java.util.*;
public class Assgnmnt4one {
	public static void main(String[] args)
	{
       System.out.println("enter a positive integer");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int flag=0;
        for(int i=2;i<num/2;i++)
        {
    	   if(num % i==0)
    	   {
    		 
    		 flag=1;
    	   }
    	   
        }
        if(flag==1)
        {
        	System.out.println(num+"is not a prime number");
        }
        else
        {
        	System.out.println(num+"is a prime number");
        }
	}   
    
}
