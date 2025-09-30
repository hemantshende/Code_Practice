package Immutability.Immutability_with_mutable_Class;

public final class Employee {
    private final String name;
    private final double salary;
    private final Address address;    //mutable object

    public Employee(String name, double salary, Address address) {
        this.name = name;
        this.salary = salary;
        // Defensive copy of mutable object
        this.address = new Address(address.getCity(), address.getState());
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Address getAddress() {
        return new Address(address.getCity(), address.getState());
    }
}
