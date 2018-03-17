import java.util.Scanner;

public class revnumber
{
	public static void main(String args[]) 
	{
		int num,mod;
		int reversenum=0;
		
		System.out.println("Enter the number");
		
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();

		for (;num != 0;num=num/10)
		{

		mod=num%10;

		reversenum=(reversenum * 10) + mod;

		//num=num/10;

		}
		
		System.out.println(reversenum);

	}


}

