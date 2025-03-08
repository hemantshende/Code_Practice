import java.util.Arrays;

public class Scaler_Example {
	
    public static int removeElement(int[] nums, int val) {

        int index=0;

        for(int i=0; i<nums.length ;i++){

            if(nums[i] != val){
                
                int temp=nums[i];
                nums[i]=nums[index];
                nums[index]=temp;
                index++;
            }
        }
        System.out.println(Arrays.toString(nums));

        return index;
        
    }

	public static void main(String[] args) {
		
		int [] arr= {0,0,1,1,1,2,2,3,3,4};
		int num= 2;
		
		System.out.println(removeElement(arr,num));
		

	}

}
