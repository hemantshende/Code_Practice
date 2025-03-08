package Oops;

class Person{
	
	String Name;
	String address;
	
    public Person() {
		
	}
	public Person(String name, String address) {
    	this.Name=name;
    	this.address=address;
	}
    public void m1() {
    	System.out.println("inside m1 in parent class");
    }
}
class Employee extends Person{
	int empId;
	String ComName;
	
	public Employee() {
		
	}


	public Employee(String Name,String address,int empId, String comName) {
		super(Name,address);
		this.empId = empId;
		this.ComName = comName;
	}
	
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", ComName=" + ComName + ", Name=" + Name + ", address=" + address + "]";
	}
		
}

class Student extends Person{
	int roll;
	String College;
	public Student(String Name,String address,int roll, String college) {
		super(Name,address);
		this.roll = roll;
		this.College = college;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", College=" + College + ", Name=" + Name + ", address=" + address + "]";
	}	
	
}
public class Inheritance {

	public static void main(String[] args) {
	Employee e1=new Employee("abc", "kolhapur",1,"boeing");
	Employee e2=new Employee("xyz", "pune", 2, "tata");
	
	
	Employee e3=new Employee();
	e3.Name="Hemant";
	e3.address="Kolhapur";
	System.out.println(e3.toString());
//	System.out.println(e1.toString());
//	System.out.println(e2.toString());
	

	}

}


