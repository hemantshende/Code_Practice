package Functional_Interface;

public class Traditional_way {
    public static void main(String[] args) {
        Greetings greetings=new Greetings() {
            @Override
            public void sayHello(String name) {
                System.out.println("hello  "+name);
            }
        };

        greetings.sayHello("hemant");
    }
}
