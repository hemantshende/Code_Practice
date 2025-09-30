package Immutability;

public final class Employee {              //make class as final
    private final int age;                 //make private final fields
    private final String name;             //Dont provide Setter

    Employee(int age,String name){
        this.age=age;
        this.name=name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

}
