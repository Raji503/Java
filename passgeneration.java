import java.util.Scanner;

public class passgeneration
{
	static char fch;
	static char lch;
	static int mod;
	static char specialch;

	public void extractstr()
	{       
		Scanner sc=new Scanner(System.in);
		String name;
		fch=0;
		lch=0;

		System.out.println("Enter your name");
		name=sc.next();

		char ch[]=name.toCharArray();
		int len=name.length();

		for(int i=0;i<len;i++)
		{
			//System.out.print(ch[i]);
			fch=ch[0];

			if(i==len-1)
			{
				lch=ch[i];
			}

		}
			
		System.out.print("\n");
		System.out.println("The first character of the given name is: " +fch);
		System.out.println("The last character of the given name is: " +lch +"\n");
	}

	public void extractnum()
	{
		Scanner sc=new Scanner(System.in);
		int num;
		mod=0;
		int summod=0;
		int sum=0;
		int sumofsum=0;  
		int sumvalue=0;

		System.out.println("Enter the number");		
		num=sc.nextInt();
		
		for (;num != 0;num=num/10)
		{

			mod=num%10;
			sum=sum+mod;

		}	
			
		System.out.println("\n" +"The first digit of the given number is: " +mod);

	
		if(sum<10)
		{
			sumvalue =sum;	
			System.out.println("The sum of given number is: " +sumvalue);
		}

		else if(sum>10)	
		{
			
			for (;sum != 0;sum=sum/10)
			{
				summod=sum%10;
				sumofsum=sumofsum+summod;
			}
			
			sumvalue = sumofsum;
			System.out.println("The sum of given number is: " +sumofsum);
		}
		
	

					
		//char symbol[]={'&','*','-','+','@','$','!','%','#','='};
		
		specialch=0;

		for(int i=0;i<10;i++)
		{
		
			char symbol[]={'&','*','-','+','@','$','!','%','#','='};
		
		  	if(i==sumvalue)
		  	{
				specialch=symbol[i];
				System.out.println("\n" +"The special character is " +specialch);
			}

		}

	}

	public static void main(String args[])
	
	{

		passgeneration ob=new passgeneration();
		ob.extractstr();
		ob.extractnum();
	
		System.out.print("\n");
	
		System.out.print("The generated password is: " +"\n" +"\n");
		
		System.out.print(fch);
		System.out.print(mod);		
		System.out.print(specialch);
		System.out.print(lch);

	}
		



}
