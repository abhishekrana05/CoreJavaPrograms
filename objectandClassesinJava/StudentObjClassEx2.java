/* Object and Class Example : Initialization through method */

package objectandClassesinJava;

class Student1
{
	  int rollno;
	  String name;
	  
	  void insertRecord(int r, String n)
	  {  
		  rollno=r;
		  name=n;
	  }
	  
	  void displayInformation()
	  {
		  System.out.println(rollno+" "+name);
	  }
}

public class StudentObjClassEx2 
{
	public static void main(String[] args) 
	{
		  Student1 s1=new Student1();  
		  Student1 s2=new Student1();  
		  s1.insertRecord(111,"Abhishek");  
		  s2.insertRecord(222,"Rana");  
		  s1.displayInformation();  
		  s2.displayInformation();
	}
}
