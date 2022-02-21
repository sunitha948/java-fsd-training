package training_java;

public class Assgnmnt7five {
     public static void main(String[] args)
     {
    	 String month="january";
    	try
    	{
    		 System.out.println(month.charAt(10));
    	}
    	catch(StringIndexOutOfBoundsException e)
    	{
    		System.out.println("String index out of bound exception is found");
    	}
    	 
     }
}
