



public class StringOperator
{
  public static void main(String args[])
  {
       int i;
       String str;

       int counter[] = new int[256];
       int count=0;
//       Scanner in = new Scanner(System.in);

//       System.out.print("Enter a String : ");
       str="aahhrrraAADD";

        for (i = 0; i < str.length(); i++) {
          
           counter[(int) str.charAt(i)]++; //counter[97]  
   }
       // Print Frequency of characters
       for (i = 0; i < 256; i++) {
           if (counter[i] != 0) {
        	
                 System.out.println("The character " + (char) i  + " has occurred for " + counter[i] + " times");
           }
       }
  }
}