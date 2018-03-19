/**
In fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. ... 
There are two ways to write the fibonacci series program in java: 
Fibonacci Series without using recursion. 
Fibonacci Series using recursion.
**/

// Fibonacci series without using recursion between 1 to 10

/**

class fibonacciseries

{
	public static void main(String args[])
	{
		int n1=0;

		int n2=1;

		int fib,count=10;

		System.out.print(n1 +" " +n2 +" ");

		for(int i=1;i<=count;i++)
		{
			
			fib=n1+n2;

			n1=n2;

			n2=fib;

			System.out.print(fib +" " );


		}
		
	}

} 

**/

// Fibonacci between two numbers given by the user




import java.util.Scanner;

class fibonacciseries

{
	public static void main(String args[])
	{
		int n1,n2;
		
		int fib;

		System.out.println("Enter the two numbers: ");

		Scanner sc = new Scanner(System.in);
		n1 = sc.nextInt();
		n2 = sc.nextInt();

		int n3=n1+1;

		System.out.print(n1 +" " +n3 +" ");
		

		for(int i=n1;i<=n2;)
		{
			
			fib=i+n3;

			i=n3;

			n3=fib;

			System.out.print(fib +" " );


		}
		
	}

}

