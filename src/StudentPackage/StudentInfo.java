package StudentPackage;
import java.util.*;

public class StudentInfo 
{
	int option;
	Scanner sc=new Scanner(System.in);
	ViewOperations operations=new ViewOperations();
	void viewInfo()
	{
		System.out.println(" ID  \t       Name      \tCourses Enrolled\tTotal Fees\tPaid Fees\tBalance Fees");
		System.out.println("=====\t=================\t================\t==========\t=========\t============");
		System.out.println("10001\t Yamini Bhangale \t Java, C \t\t$1200\t\t$800\t\t$400");
		System.out.println("10002\t Saurabh Menon   \t C++, C  \t\t$1200\t\t$700\t\t$500");
		System.out.println("10003\t Saumya Menon    \t Python,C\t\t$1200\t\t$500\t\t$700");
		System.out.println("10004\t Archana Botnar  \t Java, C \t\t$1200\t\t$600\t\t$600");
		System.out.println("10005\t Piyush Mohite   \t C++, C  \t\t$1200\t\t$550\t\t$650");
		
		do
		{
			System.out.println("\nPress 0 for move to menu:");
			option=sc.nextInt();
			System.out.println();
			if(option==0)
			{
				 operations.select();
			}
		}
		while(option!=0);
	}
}
