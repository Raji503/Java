/**

Java Runtime Polymorphism with Data Member
------------------------------------------

Method is overridden not the datamembers, so runtime polymorphism can't be achieved by data members.

In the example given below, both the classes have a datamember speedlimit, 
we are accessing the datamember by the reference variable of Parent class which 
refers to the subclass object. Since we are accessing the datamember which is not overridden, 
hence it will access the datamember of Parent class always.

Rule: Runtime polymorphism can't be achieved by data members.


**/

/**

class Bike
{  
	int speedlimit=90;  
}  

class Honda3 extends Bike
{  
 	int speedlimit=150;  
  
 	public static void main(String args[])
	{  
		
		Bike obj=new Honda3();  
		System.out.println(obj.speedlimit);//90  

	}  

Output:
90



Java Runtime Polymorphism with Multilevel Inheritance
-----------------------------------------------------
**/

class Animal
{  
	void eat()
	{
		System.out.println("eating");
	}  
}  

class Dog extends Animal
{  
	void eat()
	{
		//System.out.println("eating fruits");
		super.eat();
	}  
} 
 
class BabyDog extends Dog
{  
	void eat()
	{
		System.out.println("drinking milk");
	}	  

}

class dynamicpoly1
{
	public static void main(String args[])
	{  
		Animal a2,a3;  

		//a1=new Animal();  
		a2=new Dog();  
		a3=new BabyDog(); 
 		
		//a1.eat();  
		a2.eat();  
		a3.eat();  
	}
  
}  


/**
Output:

eating
eating fruits
drinking Milk





class Animal
{  
	void eat()
	{
		System.out.println("animal is eating...");
	}  
}  

class Dog extends Animal
{  
	void eat()
	{
		System.out.println("dog is eating...");
	}  
}  

class BabyDog1 extends Dog
{  
	public static void main(String args[])
	{  
		Animal a=new BabyDog1();  
		a.eat();  
	}

}  



Output:

Dog is eating


Since, BabyDog is not overriding the eat() method, so eat() method of Dog class is invoked.

**/

