/* Aggregation in Java */

package inheritanceinJava;

public class EmpAggrEx 
{
	int id;  
	String name;  
	Address address;
	
	public EmpAggrEx(int id, String name,Address address) 
	{  
	    this.id = id;  
	    this.name = name;  
	    this.address=address;  
	} 
	
	void display()
	{  
		System.out.println(id+" "+name);  
		System.out.println(address.city+" "+address.state+" "+address.country);  
	}  
	
	public static void main(String[] args) 
	{
		Address address1=new Address("Jharsuguda","Odisha","india");
		Address address2=new Address("Sambalpur","Odisha","india");
		  
		EmpAggrEx e=new EmpAggrEx(111,"Abhishek",address1);
		EmpAggrEx e2=new EmpAggrEx(112,"Pritish",address2);
		      
		e.display(); 
		e2.display();

	}

}
