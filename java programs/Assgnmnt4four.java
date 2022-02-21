package training_java;
import java.util.*;
public class Assgnmnt4four {
 public static double EmployeeBonus(double salary)
 {
	double bonus=salary*.05;
	return bonus;
 }
 public static void main(String[] args)
 {
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Year of service :");
	 double year=sc.nextInt();
	 /*System.out.print("Salary :");
	 double salary=sc.nextInt();*/
	 if(year>=5)
	 {
		 System.out.print("Salary :");
		 double salary=sc.nextInt();
		 double bonus=EmployeeBonus(salary);
		 double net_bonus=salary+bonus;
		 System.out.print("Net bonus ="+net_bonus);
	 }
	 else
	 {
		 System.out.print("Not eligible for bonus");
	 }
 }
}
