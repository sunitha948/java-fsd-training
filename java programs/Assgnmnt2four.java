package training_java;

class Father {
   void display()
	{
		System.out.println("Father is reading");
	}
}
class Mother extends Father
	{
		void cook()
		{
			System.out.println("mother is coocking");
		}
	}
class Baby extends Mother
{
	void cry()
	{
		System.out.println("baby is crying");
	}
}
public class Assgnmnt2four
{
	public static void main(String[] args)
	{
		Baby x=new Baby();
		x.display();
		x.cook();
		x.cry();
	}
}