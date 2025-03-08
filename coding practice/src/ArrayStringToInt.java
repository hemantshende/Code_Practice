import java.util.ArrayList;
import java.util.Arrays;

public class ArrayStringToInt {

	public static void main(String[] args) {
		String[] arr1 = { "1:1", "2:2", "1:2", "0:1" };

		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < arr1.length; i++) 
		{
			char arr3[] = new char[arr1[i].length()];

			for (int j = 0; j < arr3.length; j++) 
			{

				if (Character.isDigit(arr1[i].charAt(j))) 
				{

					list.add((int) arr1[i].charAt(j) - 48);
				}
			}
		}
		System.out.println(list);
	}
}
