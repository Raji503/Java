import java.util.Scanner;

public class alternatechar
{
	public static void main(String args[])
	{
		
		String str;
		System.out.println("Enter the string: ");
		
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();

		System.out.println(str);
		
		String str1[]=str.split("\\s");
		
		

		for(int i=0;i<str1.length;i++)
		{
			System.out.println(str1[i]);
		}
		
		for(int j=0;j<str1.length;j++)
		{

			int len = str1[j].length();
			System.out.println(len);
		
		}

	}

}