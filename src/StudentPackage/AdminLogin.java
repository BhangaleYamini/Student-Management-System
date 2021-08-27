package StudentPackage;
import java.util.*;

public class AdminLogin 
{
	ViewOperations operations=new ViewOperations();
	public void adminLogin()
	{
		String username="Yamini";
		String password="Yamini10";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Username: ");
		username=sc.next();
		System.out.println("Enter Password: ");
		password=sc.next();
		if(username.equals("Yamini"))
		{
			if(password.equals("Yamini10"))
			{
				System.out.println("Welcome "+username+"! You are Successfully Login.");
				System.out.println("---------------------------------------------------");
				operations.select();
			}
			else
			{
				System.out.println("Invalid Username Or Password!!! Please try again.");
				adminLogin();
			}
		}
		else
		{
			System.out.println("Invalid Username Or Password!!! Please try again.");
			adminLogin();
		}
	}
}
