package Functional_Interface;

public class Java8_lambdas {
    public static void main(String[] args) {
        Greetings greetings=(name)-> System.out.println("hello  "+name);
        greetings.sayHello("hemant");
    }
}
