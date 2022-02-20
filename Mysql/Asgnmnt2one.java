package training_java;

public class Asgnmnt2one {
	static void sum(int a,int b)
	{
		System.out.println(a+b);
	}
	static void sum(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	static void sum(int a,int b,int c,int d)
	{
		System.out.println(a+b+c+d);
	}
	static void sum(int a,int b,int c,int d,int e)
	{
		System.out.println(a+b+c+d+e);
	}
	public static void main(String[] args)
	{
		sum(3,4);
		sum(5,6,3);
		sum(8,10,2,1);
		sum(4,15,8,2,18);
	}

}
