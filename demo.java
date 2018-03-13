import java.util.Scanner;

public class demo
{
	public void calc()
	{
	int no1,no2,no3;
	System.out.println("Enter the 3 numbers");
	Scanner sc=new Scanner(System.in);
	no1=sc.nextInt();
	no2=sc.nextInt();
	no3=sc.nextInt();
		if(((no1%3==0) && (no1%5==0)) && ((no2%3==0) && (no2%5==0)) && ((no3%3==0) && (no3%5==0)))
		{
			System.out.println("Hello World");
		}
		else if((no1%3==0) && (no2%3==0) && (no3%3==0))
		{
		
		  	System.out.println("Hello");
		}
		else if((no1%5==0) && (no2%5==0) && (no3%5==0))
		{
		
			System.out.println("World");
		}
		
		else
		{
			System.out.println("Number is not divisible by both 3 and 5");
		}	
	}
	
	public static void main(String args[])
	{
		demo ob=new demo();
		ob.calc();	

	}
}