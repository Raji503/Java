import java.util.Scanner;

public class printevennames
{
	public static void main(String args[])
	{
		System.out.println("Enter the 5 names");
		Scanner sc=new Scanner(System.in);
		int i=1;
		while(i<6)
		{
			String s=sc.next();
		
			if(i%2!=0)
			{
			i++;
			continue;
			}
			System.out.println(s);
			i++;
		}
				
		

	}
}