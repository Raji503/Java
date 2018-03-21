import java.util.Scanner;

public class indexofnumber
{


	public static int findindex(int a[],int val)
	{	
		//if(a==null)
		
		//return -1;		
		
		for(int i=0;i<a.length;i++)
		{
			
			if(a[i]==val)
			{
				
				return i;										

			}

		
		}
		return -1;
		
		
	}

	public static void main(String args[])
	{

		int n;
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of the array n: ");	
		
		n=sc.nextInt();

		int a[]=new int[n];
		
		System.out.println("Enter the array elements");

		for(int j=0;j<n;j++)
		{
			a[j]=sc.nextInt();
		}
		
		int no[]=new int[3];

		for(int j=0;j<3;j++)
		{

			System.out.println("Enter the number to get its index value: ");	

			no[j]=sc.nextInt();
		
			int val=no[j];

			int index=findindex(a,val);


			if(index==-1)
			{
			
				System.out.println("The number is not in array list");
			}

			else

			{
				System.out.println("The index of the given number " +val +" is " +index);

			}
		}

	}


}