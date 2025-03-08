import java.util.Random;

public class RandomNumbersAndString {

	public static void main(String[] args) {
		
		//Using RANDOM Class
		Random r=new Random();
		
		int randInt=r.nextInt(10);//random no betn 0-9
		System.out.println(randInt);
		
		double randDouble=r.nextDouble(10);//0.0-9.999
		System.out.println(randDouble);
		
		//using MATH Class
		System.out.println(Math.random());//0.0-0.9

	}

}
