import java.util.Scanner;

public class swapwithoutvar
{
	public static void main(String args[])
	{
		int num1,num2;
		
		System.out.println("Enter the two numbers:");

		Scanner sc=new Scanner(System.in);
		num1=sc.nextInt();
		num2=sc.nextInt();

		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;		
		
		System.out.println("The value of num1 after swapping is: " +num1);
		System.out.println("The value of num2 after swapping is: " +num2);


	}
}
