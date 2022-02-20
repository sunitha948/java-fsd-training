package training_java;

interface Time {
   void read();
   void write();
}
public class Assgnmnt3two implements Time
{
	public static void main(String[] args)
	{
		Assgnmnt3two obj = new Assgnmnt3two();
		obj.read();
		obj.write();
	}
	public void read()
	{
		System.out.println("reading time");
	}
	public void write()
	{
		System.out.println("writing time");
	}
	
}