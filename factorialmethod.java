import java.util.Scanner;

public class factorialmethod
{
	static int factorial(int n)
	{
		if(n==0)

		return 1;

		else

		return(n*factorial(n-1));
		
	}

	public static void main(String args[])
	{
		int no;
		int fact;

		System.out.println("Enter the number: ");

		Scanner sc=new Scanner(System.in);
		no=sc.nextInt();
		
		fact=factorial(no);

		System.out.println("The factorial of the given number is : " +fact);
	}
	
}

