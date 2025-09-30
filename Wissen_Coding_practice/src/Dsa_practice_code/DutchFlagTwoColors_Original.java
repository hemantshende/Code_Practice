package Dsa_practice_code;

import java.util.Arrays;

/*
ps-
Sort this array in O(n) time using one loop and no extra space:
javaCopyEditint[] a = {1,2,1,2,1,2,1,1,2,2};
(Implement Dutch National Flag algorithm)
*/


public class DutchFlagTwoColors_Original {
    public static void main(String[] args) {
        int[] a = {1,2,1,2,1,2,1,1,2,2};

        int low = 0;                // next position for 1
        int high = a.length - 1;    // next position for 2
        int i = 0;

        while (i <= high) {
            if (a[i] == 1) {
                // swap a[i] with a[low] and move both pointers
                int temp = a[i];
                a[i] = a[low];
                a[low] = temp;
                low++;
                i++;
            } else { // a[i] == 2
                // swap a[i] with a[high] and decrease high pointer
                int temp = a[i];
                a[i] = a[high];
                a[high] = temp;
                high--;
                // do NOT increment i because swapped element needs to be checked
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
