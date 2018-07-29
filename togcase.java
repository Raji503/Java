//Toggle all characters in a string

import java.util.*;
public class togcase
{
	public static void main(String args[])
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.next();

		char c[]=str.toCharArray();
                char ch=' ';
                StringBuilder tog=new StringBuilder(c.length);
		System.out.println("The given string characters are ");
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i] + " ");

		}
		
		for(int i=0;i<c.length;i++)
		{
			if(Character.isLowerCase(c[i]))
                        {
                             ch=Character.toUpperCase(c[i]);
                             tog.append(ch);
                        }
                        else if(Character.isUpperCase(c[i]))
                        {
                            ch=Character.toLowerCase(c[i]);
                            tog.append(ch);
                                      
                        }
                        else
                           tog.append(c[i]);
                }
                System.out.println();
                System.out.println("The toggled String is " +"\n");
                System.out.print(tog +" ");
        }
}