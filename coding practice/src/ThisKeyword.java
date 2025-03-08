
class Person  
{  
    String name,address;   
    int age;  
    
//    public Person(int a, String n, String add)  /////this is also right
//    {  
//       age = a;  
//        name = n;  
//        address = add;  
//    } 
    public Person() {
    	
    }
    
    public Person(int age, String name, String address)  
    {  
        this.age = age;  
        this.name = name;  
        this.address = address;  
    } 
    /*
     * this keyword differentiat the local instance and passed parameters in class constructor
     */
}  
class Employee extends Person   
{  
    float salary;  
    public Employee(int age, String name, String address, float salary)  
    {  
        super(age,name,address);  
        this.salary = salary;  
    }  
}  
public class ThisKeyword   
{  
    public static void main (String args[])  
    {  
    	Person e1=new Person();
        Employee e = new Employee(22, "Mukesh", "Delhi", 90000);  
        System.out.println("Name: "+e.name+" Salary: "+e.salary+" Age: "+e.age+" Address: "+e.address);  
    }  
}  