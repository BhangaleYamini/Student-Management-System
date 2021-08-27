package StudentPackage;

public class CourseDetails 
{
	ViewOperations operations=new ViewOperations();
	
	public void viewCourses()
	{
		System.out.println("Sr No.\tCourse Name\tCourse Fees\tCourse Duration");
		System.out.println("======\t============\t==========\t==============");
		System.out.println(" 01   \t    Java    \t    $600  \t    3 months  ");
		System.out.println(" 02   \t   Python   \t    $600  \t    4 months  ");
		System.out.println(" 03   \t    C++     \t    $600  \t   2.5 months ");
		System.out.println(" 04   \t      C     \t    $600  \t    3 months  ");
		System.out.println(" 05   \t    .Net    \t    $600  \t    3 months  ");
		System.out.println();
		operations.select();
	}
}
