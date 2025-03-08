
class main{
	public static int foo(int[ ] arr) {
		int result=-1;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>result) {
				result=arr[i];
			}
			
		}
		return result;
	}
}
public class test {

	public static void main(String[] args) {
	
	}

}
