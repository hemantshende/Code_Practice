
public class SumOF_ElementsInArray {

	public static void main(String[] args) {
		
		int [] arr= {5,4,8,6,9};
		int sum=0;
		for(int i=0;i<=arr.length-1;i++) {
			sum=sum+arr[i];
		}
		System.out.println("USING Noraml FOR-LOOP: "+sum);
		
		//FOR_EACH LOOP
		int sum1=0;
		for(int e:arr) {
			sum1=sum1+e;
		}

		System.out.println("USING FOR-EACH: "+sum1);
	}

}
