package SOLID_Bird.v4;

public class Sparrow extends Bird implements Flyable {
	
	FlyLow flyLow=new FlyLow();
	public void fly() {
		flyLow.doFly();
	}

	public void makeSound() {
		System.out.println("gutur");
	}

}
