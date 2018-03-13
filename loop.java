import java.util.Scanner;

public class loop
{
	public void calc()
	{
		int no;
		for(int i=0;i<3;i++)
		{
		System.out.println("Enter the number");                                                                           		
		Scanner sc=new Scanner(System.in);
		no=sc.nextInt();

			if((no%3==0) && (no%5==0))
			{
			System.out.println(no +"\t" +"Hello World");
			}
			else if(no%3==0)
			{
			System.out.println(no +"\t" +"Hello");	
			}
			else if(no%5==0)
			{
			System.out.println(no +"\t" +"world");	
			}		
			else
			{
			System.out.println("Number is not divisible by both 3 and 5");
			}	
		}	

	}
	
	public static void main(String args[])
	{
		loop ob=new loop();
		ob.calc();	

	}
}