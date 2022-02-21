package training_java;


class Report1 {
	 void subject()
	 {
		 System.out.println("subject is maths");
		 
	 }
	 void teacher()
	 {
		 System.out.println("Riya is taking maths");
	 }
	}
	class Report2 extends Report1
	{
		void subject()
		{
			System.out.println("subject is english");
		}
		void teacher()
		{
			System.out.println("raam is taking english");
		}
	}
	class Attendence1
	{
		void absence()
		{
			System.out.println("2 are absent");
		}
		void present()
		{
			System.out.println("30 are present");
		}
	}
	class Attendence2 extends Attendence1
	{
		void absence()
		{
			System.out.println("3 are absent");
		}
		void present()
		{
			System.out.println("27 are present");
		}
	}
	public class  Assgnmnt2two2
	{
		public static void main(String[] args)
		{
			Report1 a;
			a=new Report2();
			a.subject();
			a.teacher();
			Attendence1 b;
			b=new Attendence2();
			b.absence();
			b.present();
		}
	}
