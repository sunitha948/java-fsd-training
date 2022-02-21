package training_java;

public class Assgnmnt8four {
    static int division(int a,int b) throws ArithmeticException
    {
    	int div=a/b;
    	return div;
    }
    public static void main(String[] args)
    {
    	Assgnmnt8four obj=new Assgnmnt8four();
    	try
    	{
    		System.out.println(obj.division(5, 0));
    	}
    	catch(ArithmeticException e)
    	{
    		System.out.println("number cannot be divided by 0");
    	}
    }
}
