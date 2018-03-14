import java.util.Scanner;

public class largeandsmall
{
	public static void main(String args[])
	{
		int largest;
		int smallest;

		//int number[]=new int[]{10,20,50,30,40}; -array values assigned while declaring
		

		int number[]=new int[5]; //size of array is 5

		Scanner sc = new Scanner(System.in);
		
	
		for(int i=0;i<5;i++) // i<5 or i<number.length
		{			

		number[i]=sc.nextInt(); //getting array values from user

		}

		largest=number[0];
		smallest=number[0];
			
											
		for(int i=0;i<5;i++)
		{
			if(number[i] > largest)
			{

			largest=number[i];
			}

			if(number[i] < smallest)
			{
			smallest=number[i];
			}
			
		}

		System.out.println("The largest number is "  +largest);
		System.out.println("The smallest number is "  +smallest);



	}
}