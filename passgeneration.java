	import java.util.Scanner;

public class passgeneration
{
	public void extractstr()
	{       
		Scanner sc=new Scanner(System.in);
		String name;
		char fch=0;
		char lch=0;
		System.out.println("Enter your name");
		name=sc.next();

		char ch[]=name.toCharArray();
		int len=name.length();
		for(int i=0;i<len;i++)
		{
		System.out.print(ch[i]);
		fch=ch[0];
		if(i==len-1)
		{
		lch=ch[i];
		}
		}
		System.out.print("\n");
		System.out.println(fch);
		System.out.println(lch);
	}

	public void extractnum()
	{
		Scanner sc=new Scanner(System.in);
		int num;
		int mod=0;
		int summod=0;
		int sum=0;
		int sumofsum=0;

		System.out.println("Enter the number");		
		num=sc.nextInt();
		
		for (;num != 0;num=num/10)
		{

		mod=num%10;
		sum=sum+mod;

		}	
		System.out.println("The last digit of the given number is: " +mod);
		System.out.println("The sum of given number is: " +sum);

		if(sum>10)	
		{
		for (;sum != 0;sum=sum/10)
		{
		summod=sum%10;
		sumofsum=sumofsum+summod;
		}
		System.out.println("The sum of given number is: " +sumofsum);
		}

					
		String symbols[]=new String("&*-+@$!%#=");
		char ch[]=symbols.toCharArray();
		char symbol[];

		for(int i=0;i<10;i++)
		{
		  System.out.print(ch[i]);
		  if(ch[i]==sum)
		  symbol=ch[i];
		  else if(ch[i]=sumofsum)
		  symbol=ch[i];
		}
		System.out.println(symbol);
			

	}

		public static void main(String args[])	
		{
		passgeneration ob=new passgeneration();
		//ob.extractstr();
		ob.extractnum();
		}
		



}