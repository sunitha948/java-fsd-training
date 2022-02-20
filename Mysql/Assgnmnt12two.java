package training_java;

import java.util.Scanner;

public class Assgnmnt12two {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	   System.out.println("enter the number");
	   int num=sc.nextInt();
	   int number=num;
	   if(num>0)
	   {
	     while(num>0)
	     {
	    	
	     int rem=num%10;
		   if(rem==0)
		   {
			   System.out.println(number+" is a duck number.");
			   break;
		   }
		   num=num/10;
	     }
	   }
}
}
