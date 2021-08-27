package StudentPackage;
import java.util.*;

public class ViewOperations 
{
	public void select()
	{
		int choice;
		AdminLogin login=new AdminLogin();
		CourseDetails details=new CourseDetails();
		StudRegistration regstud=new StudRegistration();
		Registration register=new Registration();
		StudentInfo info=new StudentInfo();
		Payment pay=new Payment();
		do
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("***Operations***");
			System.out.println("1.New Student Registration\n2.Course Details\n3.View Student Information\n4.Pay Balance Fees\n5.Logout\n");
			System.out.println("Enter your choice: ");
			choice=sc.nextInt();
			System.out.println();
			switch(choice)
			{
			case 1:
				System.out.println("***Student Registration***");
				//call method for registration
				regstud.add();
				break;
			case 2:
				System.out.println("***Course Details***");
				//call method for Course Details
				details.viewCourses();
				break;
			case 3:
				System.out.println("************View Student Information************");
				//call method for View Balance
				info.viewInfo();
				break;
			case 4:
				System.out.println("***Pay Balance Fees***");
				//call method for Pay Balance Fees
				pay.makePayment();
				break;
			case 5:
				System.out.println("***You are Successfully Logout***\n");
				//call method for admin login
				login.adminLogin();
				break;
			default:
				System.out.println("Invalid choice!!!");
			}
		}
		while(choice >5 );
	}
}
