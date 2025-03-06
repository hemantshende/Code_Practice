package SOLID_Bird.v0;

public class Bird {
	private String name;
	private String type;
	int noOfWings;
	boolean canFly;
	
	public Bird(String name, String type, int noOfWings, boolean canFly) {
		this.name = name;
		this.type = type;
		this.noOfWings = noOfWings;
		this.canFly = canFly;
	}
	
	public void eat() {
		System.out.println("bird is eating");
	}
	
	public void fly() {
		
	}
	
	public void makeSound() {
		if(type.equals("sparrow")) {
			System.out.println("gutu gutur");
		}
		else if(type.equals("peacock")) {
			System.out.println("meeooo");
		}else if(type.equals("crow")) {
			System.out.println("cow cow");
		}
	}
	

}
