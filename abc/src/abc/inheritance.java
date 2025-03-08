package abc;


class Person{
	String name;
	String Address;
	public Person(String name, String address) {
		this.name = name;
		Address = address;
	}
	
}
class Employee extends Person{
 int empId;
 String Company;

    public Employee(String name, String address,int empId, String company) {
    	super(name, address);
	this.empId = empId;
	Company = company;
    }

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", Company=" + Company + "]";
	}
    
}


class Student extends Person{
	
	int studentRoll;
	String college;
	
	public Student(String name, String address,int studentRoll,String college) {
		super(name, address);
		this.studentRoll=studentRoll;
		this.college=college;
			
}
public class Inheritance {

	public static void main(String[] args) {
		Employee e1=new Employee("amana","kolhapur",1, "abc");
		Employee e2=new Employee("sujata","kolhapur",2, "xyz");
		e1.toString();
	}

}}
