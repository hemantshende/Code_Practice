package Dsa_practice_code;

import java.util.Arrays;

public class DutchFlagTwoColors_MyApproach {
    public static void main(String[] args) {
        int[] a = {1,2,1,2,1,2,1,1,2,2};

        int left=0;
        int right=a.length-1;

        while(left<right){
            if(a[left]<a[right]){
                right--;
            } else if (a[left]>a[right]) {
                int temp=a[left];
                a[left]=a[right];
                a[right]=temp;
                left++;
                right--;
            } else if (a[left]==a[right]){
                if(a[left]==1){
                    left++;
                }else{
                    right--;
                }
            }
        }

        System.out.println(Arrays.toString(a));
    }
}
