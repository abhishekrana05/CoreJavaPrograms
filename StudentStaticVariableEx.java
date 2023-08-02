/* Java Program to demonstrate the use of static variable */

package ObjectandClassesinJava;

class Student2
{
	   int rollno; //instance variable  
	   String name;  
	   static String college ="Utkal university"; //static variable  
	   
	   //constructor  
	   Student2(int r, String n)
	   {  
	   rollno = r;  
	   name = n;  
	   }  
	   
	   //method to display the values  
	   void display ()
	   {
		   System.out.println(rollno+" "+name+" "+college);
	   }  
}

public class StudentStaticVariableEx 
{
	public static void main(String[] args) 
	{
		 Student2 s1 = new Student2(111,"Abhishek");  
		 Student2 s2 = new Student2(222,"Prince");  
		 
		 //we can change the college of all objects by the single line of code  
		 //Student.college="Sambalpur University";
		 s1.display();  
		 s2.display(); 

	}
}
