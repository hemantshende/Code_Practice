
public class ReverseArray {

	public static void main(String[] args) {
		int[] a={1,2,3,4,5,6};
	
		int[] b=new int[a.length];
		
		
		for(int i=a.length-1;i>=0;i--) {
			b[(a.length-1)-i]=a[i];   //------  b[(6-1)-5]=a[5] ------b[0]=a[5] ----for first itr
		}
		
		for (int i = 0; i < b.length; i++) {
			
			System.out.print(b[i]+" ");
		}
	}

}
