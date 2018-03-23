import java.util.Scanner;

public class alternatechar
{	

	static int len;
	
	public static void main(String args[])
	{
		
		String str;

		System.out.println("Enter the string: ");
		
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();

		System.out.println("\n" +"The given string is: " +str +"\n");
		
		String str1[]=str.split("\\s");
		
		System.out.println("After using split: ");
		
		for(int i=0;i<str1.length;i++)
		{
			
			System.out.println(str1[i]);

		}

		System.out.println("\n" +"Printing alternate characters: ");
		
		
		for(int j=0;j<str1.length;j++)
		{

			len = str1[j].length();

			//System.out.println(len);

			for(int i=0;i<len;i=i+2)
			{

				char ch[]=str1[j].toCharArray();

				System.out.print(ch[i] +"  ");

			}

		
		}			
		

	}

}
