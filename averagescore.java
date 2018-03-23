import java.util.Scanner;

public class averagescore
{
	static double sum=0;

	public double calcsum(String name, int totalmarks)
	{

		sum=sum+totalmarks;			
		
		return sum;
		
	}

	public static void main(String args[])
	{	
		
		averagescore ob=new averagescore();

		Scanner sc=new Scanner(System.in);
	
		String name;
		int totalmarks;
				
		int i=1;

		while(i<=10)
			{

			System.out.println("Enter the student name: ");
	
			name=sc.next();

			System.out.println("Enter the student marks: ");

			totalmarks=sc.nextInt();

			sum=ob.calcsum(name,totalmarks);
		
			i++;
		
			}

		double average=sum/10;

		System.out.println("The sum of students totalmarks is: " +sum);

		System.out.println("The average marks of 10 students is: " +average);
		
	}
}
