abstract class Cal{
	abstract int add(int a, int b);
	
}
class Adder extends Cal{
	public int add(int a,int b) {
		return a+b;
	}	
}
public class Solution {

	public static void main(String[] args) {
		Adder a=new Adder();

		System.out.println(a.add(4,2));
	}

}
