/**
Dynamic (run time) polymorphism is the polymorphism existed at run-time. 
Here, Java compiler does not understand which method is called at compilation time. 
Only JVM decides which method is called at run-time. Method overloading and method overriding 
using instance methods are the examples for dynamic polymorphism.


Polymorphism in java is a concept by which we can perform a single action by different ways. 
Polymorphism is derived from 2 greek words: poly and morphs. The word "poly" means many and "morphs" means forms. So polymorphism means many forms.

There are two types of polymorphism in java: compile time polymorphism and runtime polymorphism. 
We can perform polymorphism in java by method overloading and method overriding.

If you overload static method in java, it is the example of compile time polymorphism. 
He, we will focus on runtime polymorphism in java.


Runtime Polymorphism in Java:
-----------------------------

Runtime polymorphism or Dynamic Method Dispatch is a process in which a call to an overridden 
method is resolved at runtime rather than compile-time.

In this process, an overridden method is called through the reference variable of a superclass. 
The determination of the method to be called is based on the object being referred to by the reference variable.

Let's first understand the upcasting before Runtime Polymorphism.

Upcasting:
----------

When reference variable of Parent class refers to the object of Child class, it is known as upcasting. 
For example:

Upcasting in java:
------------------

class A
{
}  
class B extends A
{
}  
A a=new B();//upcasting  


Example of Java Runtime Polymorphism:
-------------------------------------

In this example, we are creating two classes Bike and Splendar. Splendar class extends Bike class and overrides its run() method. 
We are calling the run method by the reference variable of Parent class. Since it refers to the subclass object 
and subclass method overrides the Parent class method, 
subclass method is invoked at runtime.


Since method invocation is determined by the JVM not compiler, it is known as runtime polymorphism.

**/


/**
class Bike
{  
	void run()
	{
		System.out.println("running");
	}  

}  

class Splender extends Bike
{  
	void run()
	{
		System.out.println("running safely with 60km");
	}  
  
  	public static void main(String args[])
	{  
	
    		Bike b = new Splender();//upcasting  
    		b.run();  
  	} 
 
}  

**/

/**

Output:running safely with 60km.


Java Runtime Polymorphism 
Example: Bank
Consider a scenario, Bank is a class that provides method to get the rate of interest. 
But, rate of interest may differ according to banks. 
For example, SBI, ICICI and AXIS banks are providing 8.4%, 7.3% and 9.7% rate of interest.


Note: This example is also given in method overriding but there was no upcasting.

**/


class Bank
{  
	float getRateOfInterest()
	{
		return 0;
	}  

} 
 
class SBI extends Bank
{  
	float getRateOfInterest()
	{
		return 8.4f;
	}  

}
  
class ICICI extends Bank
{  
	float getRateOfInterest()
	{
		return 7.3f;
	}  

}
  
class AXIS extends Bank
{  
	float getRateOfInterest()
	{
		return 9.7f;
	}
  
}
  
class dynamicpoly
{  
	public static void main(String args[])
	{  
		Bank b;  

		b=new SBI();  
		System.out.println("SBI Rate of Interest: "+b.getRateOfInterest()); 
 
		b=new ICICI();  
		System.out.println("ICICI Rate of Interest: "+b.getRateOfInterest());  

		b=new AXIS();  
		System.out.println("AXIS Rate of Interest: "+b.getRateOfInterest());  
	}  

}  


/**
Output:

SBI Rate of Interest: 8.4
ICICI Rate of Interest: 7.3
AXIS Rate of Interest: 9.7

**/




