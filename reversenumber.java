import java.util.Scanner;

public class reversenumber
{
	public static void main(String args[])
	{
		/**int no[]=new int[]{1,2,3,4,5};
		
		for (int i=4;i>=0;i--)
		{
			System.out.print(no[i]);
		}**/

		int no[]=new int[5];
		Scanner sc=new Scanner(System.in);

		for(int i=0;i<5;i++)
		{
			no[i]=sc.nextInt();
		}
		
		for(int i=4;i>=0;i--)
		{
			System.out.print(no[i]);
		}

	}
}