import java.util.Scanner;

public class factorial
{
	public static void main(String args[])
	{
		int no;
		int fac=0;

		System.out.println("Enter the number: ");

		Scanner sc=new Scanner(System.in);
		no=sc.nextInt();
	
		for (int i=no-1;i>0;i=i-1)
		{	
			no=no*i;
			fac=no;
		}

		System.out.println("The factorial of the given number is : " +fac);
	}
	
}