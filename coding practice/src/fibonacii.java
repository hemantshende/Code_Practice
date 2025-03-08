import java.util.Arrays;

public class fibonacii {
	
	public static void main(String[] args) {
		int[] array=new int[12];
		
		int res=0;
		array[0]=0;
		array[1]=1;
		System.out.println(array[0]);
		for(int i=2;i<11;i++) {
			array[i+1]=array[i]+array[i-1]; //@
		    res=array[i+1];
		    System.out.println(res);	
		}
		 
	}


}
