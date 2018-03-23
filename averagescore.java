import java.util.Scanner;

public class averagescore
{
	static int sum=0;

	public int calcaverage(String name, int totalmarks)
	{	
		//int i=1;

	//		while(i<=5)
	//	{
		sum=sum+totalmarks;
		
	//	}		
		
		return sum;	
	//	i++;
	}

	public static void main(String args[])
	{	
		Scanner sc=new Scanner(System.in);

	
		String name;
		int totalmarks;
				
		averagescore ob=new averagescore();
		
		int i=1;

		while(i<=5)
		{

		System.out.println("Enter the student name: ");

		name=sc.next();

		System.out.println("Enter the student marks: ");

		totalmarks=sc.nextInt();

		//sum=ob.calcaverage(name,totalmarks);

		}
		i++;

		int average=sum/10;
		System.out.println(average);
		
	}
}
