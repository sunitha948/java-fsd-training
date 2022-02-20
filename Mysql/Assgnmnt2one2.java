package training_java;

public class Assgnmnt2one2 {
	static void sum(int a,int b)
	{
		System.out.println(a+b);
	}
	static void sum(int a,double b)
	{
		System.out.println(a+b);
		
	}
	static void sum(double a,double b)
	{
		System.out.println(a+b);
	}
	static void sum(int a,int b,double c)
	{
		System.out.println(a+b+c);
	}
	public static void main(String[] args)
	{
		sum(2,5);
		sum(3,8.5);
		sum(12.678,3.76);
		sum(6,5,7.654);
	}

}
