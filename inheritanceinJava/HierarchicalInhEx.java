/* Hierarchical Inheritance in Java */

package inheritanceinJava;

class Animal2
{  
	void eat()
	{
		System.out.println("Eating...");
	}
}

class Dog2 extends Animal2
{  
	void bark()
	{
		System.out.println("Barking...");
	}
}

class Cat extends Animal2
{
	void meow()
	{
		System.out.println("Meowing...");
	}
}  

public class HierarchicalInhEx 
{
	public static void main(String[] args) 
	{
		Cat c=new Cat();
		c.meow();
		c.eat();
	}
}
