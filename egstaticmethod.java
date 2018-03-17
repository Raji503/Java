/**public class egstaticmethod
{
	public static void eg()			// When a method is static, no need to create an instance of the class
	{					
		int a=10;				
		System.out.print(a);
	}
	public static void main(String args[])
	{
		eg();				// The static methods can be called directly without creating an object.	
	}



}**/



class egstaticmethod
{


	public void eg()			// eg() is non-static method, hence we need to create an instance of the class	
	{
		int a=10;
		System.out.print(a);

	}
	public static void main(String args[])
	{
		egstaticmethod ob=new egstaticmethod();	// Non - static methods can be called using object of class 
		ob.eg();
		
	}



}






