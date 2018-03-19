import java.util.Scanner;

public class swapwithvar
{
	public static void main(String args[])
	{
		int a,b;
		int c;
		
		System.out.println("Enter a and b:");

		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();

		if((a==0) || (b==0))
		{
		 System.out.println("Invalid input");
		}
		else if((a!=0) && (b!=0))
		{
		c=a;
		a=b;
		b=c;
		}
		
		System.out.println("The value of a is: " +a);
		System.out.println("The value of b is: " +b);


	}
}