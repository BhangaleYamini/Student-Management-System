package StudentPackage;
import java.util.*;

public class Payment 
{
	Scanner sc=new Scanner(System.in);
	ViewOperations operations=new ViewOperations();
	void makePayment()
	{
		System.out.print("Enter Your Name: ");
		String name=sc.next();
		System.out.print("Enter Amount to pay: $");
		int payment=sc.nextInt();
		System.out.println("\n***Thank You for your payment of $"+payment+"***\n");
		operations.select();
	}
}
