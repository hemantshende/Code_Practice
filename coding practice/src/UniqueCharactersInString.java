//import java.util.HashSet;
//import java.util.Iterator;
//import java.util.Set;
//
///* Ask the Code-
//               Given the two strings, find if both strings have the same set of unique characters. 
//               Both strings are made of lowercase Roman alphabets. 
//               Example 1: aabbc and abc Ans: True
//               Example2: abcd and abc Ans: False
//               Example 3: bbddcc and dcb Ans: True
//               */
//
//public class UniqueCharactersInString {
//
//	public static boolean Check(String str1, String str2) {
//		Set<Character> s1=new HashSet<Character>(); // unique and sort
//		Set<Character> s2=new HashSet<Character>();
//
//		for (int i = 0; i < str1.length(); i++) {
//			s1.add(str1.charAt(i));	
//		}
//		System.out.println("s1  ="+s1.toString());
//		
//		
//		for (int i = 0; i < str2.length(); i++) {
//			s2.add(str2.charAt(i));	
//		}
//		System.out.println("s2  ="+s2.toString());
//		
//		
//		if(s1.size()==s2.size() && s1.equals(s2)) {
//			return true;
//		}else {
//			return false;
//		}
//			
//		}
//	
//	public static void main(String[] args) {
//
//		String str1 = "aabbcc";
//		String str2 = "fgh";
//		System.out.println(Check(str1, str2));
//	}
//}


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Ask the Code-
               Given the two strings, find if both strings have the same set of unique characters. 
               Both strings are made of lowercase Roman alphabets. 
               Example 1: aabbc and abc Ans: True
               Example2: abcd and abc Ans: False
               Example 3: bbddcc and dcb Ans: True
               */

public class UniqueCharactersInString {

	public static boolean Check(String str1, String str2) {
		String a = getString(str1.charAt(0)),
		           b = getString(str2.charAt(0));
		 
		    // Now if there are adjacent similar character
		    // remove that character from s1
		    for (int i = 1; i < str1.length(); i++)
		        if (str1.charAt(i) != str1.charAt(i - 1))
		        {
		            a += getString(str1.charAt(i));
		            a += str1.charAt(i);
		          
		        }
		 
		    // Now if there are adjacent similar character
		    // remove that character from s2
		    for (int i = 1; i < str2.length(); i++)
		        if (str2.charAt(i) != str2.charAt(i - 1))
		        {
//		            b += getString(str2.charAt(i));
		            b+=str2.charAt(i);
		        }
		 
		    // If both the Strings are equal
		    // then return true
		    if (a.equals(b))
		        return true;
		 
		    return false;
		}
	
	static String getString(char x)
	{
	 
	    // String class has a constructor
	    // that allows us to specify size of
	    // String as first parameter and character
	    // to be filled in given size as second
	    // parameter.
	    String s = String.valueOf(x);
	    return s;
	}
	public static void main(String[] args) {

		String str1 = "aaccbbcc";	
		String str2 = "abc";
		System.out.println(Check(str1, str2));
	}
}

