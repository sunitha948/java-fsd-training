package training_java;

abstract class Methods {
  Methods()
  {
	  System.out.println("constructor is called");
  }
  abstract void method1();
  void method2()
  {
	  System.out.println("the  method2 is invoked");
  }
  abstract void method3();
  
}
class Assgnmnt3three extends Methods
{
	void method1()
	{
		System.out.println("method1 is invoked");
	}
	void method3()
	{
		System.out.println("method3 is invoked");
	}
	public static void main(String[] args)
	{
		Methods obj = new Assgnmnt3three();
		obj.method1();
		obj.method2();
		obj.method3();
	}
}
