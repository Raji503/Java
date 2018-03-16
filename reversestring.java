public class reversestring
{
	public static void main(String args[])
	{
		String str=new String("Java");
		char ch[]=str.toCharArray();
		for (int i=3;i>=0;i--)
		{
			System.out.print(ch[i]);
		}

		/**StringBuilder str= new StringBuilder("Fruits");
		System.out.print(str.reverse());**/

	}

}