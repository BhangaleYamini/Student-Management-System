package StudentPackage;
import java.util.*;

class Registration
{
	private String fname;
	private String lname;
	private int id=1000;
	int gradelevel;
	String studentId;
	String Courses=" ";
	int tuitionBalance;
	static int CostOfCourse= 600;
	
	Scanner sc=new Scanner(System.in);
	void studInfo()
	{
		System.out.println("Enter Student's First Name: ");
		this.fname=sc.next();
		System.out.println("Enter Student's Last Name: ");
		this.lname=sc.next();
		System.out.println("Enter Student's Grade Level: ");
		this.gradelevel=sc.nextInt();
		
		setStudentID();
		System.out.println("-----------------------------------------------------");
		enroll();
	}

	//generate id
	private void setStudentID()
	{
		id++;
		//gradelevel+ID
		this.studentId=gradelevel+""+id;
	}	//end of method
	
	//enroll courses
	public void enroll()
	{
		String course;
		Courses=" ";
		tuitionBalance=0;
		System.out.println("Choose any Courses from:");
		System.out.print("1.Java\t2.C\t3.Python\t4..Net\t5.C++\n");
		System.out.println("***********************************************************************");
		
		do
		{
			
			System.out.print("Enter Courses to Enroll & Press E to Exit:");
			course=sc.next();
			if(!course.equals("E"))
			{
				Courses=Courses+"\n  "+ course;
				tuitionBalance=tuitionBalance + CostOfCourse;
			}
			
			else
			{
				System.out.println("Exit\n");
				break;
			}
		
		}
		while(1 != 0);
		System.out.println("You are enrolled in: "+Courses);
		System.out.println("****************************************");
		System.out.println("Tuition Balance: $"+tuitionBalance);
		System.out.println();
		payTuition();
	}
		//view balance
		void viewBalance()
		{
			System.out.println("Your balance is: $"+tuitionBalance);
			System.out.println("===========================================");
		}
		
		//pay tution
		void payTuition()
		{
			System.out.print("Enter Amount to pay: $");
			int payment=sc.nextInt();
			tuitionBalance=tuitionBalance - payment;
			System.out.println("\n***Thank You for your payment of $"+payment+"***");
			viewBalance();
		}
		public void showInfo()
		{
			System.out.println();
			System.out.println("*****STUDENT INFORMATION*****");
			System.out.println();
			System.out.println("Student Name: "+fname+" "+lname);
			System.out.println("Student ID: "+studentId);
			System.out.println("Courses Enrolled: "+Courses);
			System.out.println("Balance Fees: "+tuitionBalance);
			
		}
		
}

public class StudRegistration 
{
	public void add()
	{
		int n;
		Scanner sc=new Scanner(System.in);
		ViewOperations operations=new ViewOperations();
		Registration register=new Registration();
		System.out.println("Enter number of students to be add: ");
		n=sc.nextInt();
		System.out.println("---------------------------------------");
		
		Registration[] reg=new Registration[n];
		for(int i=0;i<n;i++)
		{
			reg[i]=new Registration();
			register.studInfo();
			register.showInfo();
			System.out.println("==========================================\n");
			
		}
		operations.select();
	}
}
