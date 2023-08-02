/* Java Program to demonstrate the use of a static method */

package ObjectandClassesinJava;

class Student3
{  
    int rollno;  
    String name;  
    static String college = "Utkal University";  
    
    //static method to change the value of static variable  
    static void change()
    {  
    	college = "Sambalpur University";  
    }
    
    //constructor to initialize the variable
    Student3(int r, String n){  
    rollno = r;  
    name = n;  
    }
    
    //method to display values  
    void display()
    {
    	System.out.println(rollno+" "+name+" "+college);
    }  
}  

public class StudentStaticMethodEx 
{
	public static void main(String[] args) 
	{
		Student3.change();//calling change method  
	    //creating objects  
	    Student3 s1 = new Student3(111,"Abhishek");  
	    Student3 s2 = new Student3(222,"Prince");  
	    Student3 s3 = new Student3(333,"Bimal");  
	    //calling display method  
	    s1.display();  
	    s2.display();  
	    s3.display();
	}
}
