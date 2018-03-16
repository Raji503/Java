//If the variable "a" is declared as static. No need to create instance of class
//egstatic in main method. We can call the variable directly.

/**class egstatic
{
	static int a=5;

	public static void main(String args[])
	{
		System.out.print(a);
	}

}**/

//If the variable "a" is not declared as static. We need to create instance of class egstatic
//in main method and we need to call the variable using the object of a class.

class egstatic
{
	int a =9;
	
	public static void main(String args[])
	{
		egstatic ob=new egstatic();
		System.out.print(ob.a);
		
	}
}


