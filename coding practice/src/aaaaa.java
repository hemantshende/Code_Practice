
//que==6
//class aaaaa {
//	public static void main(String[] args) {
//	try {
//		int res=5%0;
//	}catch(ArithmeticException e) {
//		System.out.println("ArithmaticException =>  "+e.getMessage());
//	}
//	finally {
//		System.out.println("this is the final result");
//	}
//	}
//	
//}


// que==11
//class aaaaa {
//	public static void main(String[] args) {
//	List<Boolean> list=new ArrayList<>();
//	list.add(true);
//	list.add(Boolean.parseBoolean("false"));
//	list.add(Boolean.TRUE);
//	System.out.println(list.size());
//	System.out.println(list.get(1)instanceof Boolean);
//	}
//	
//}

//que12
// interface Strfunc{
//	 String disp(String n);
// }
//class aaaaa {
//	public static void main(String[] args) {
//	Strfunc output=(str) -> {
//		String result="";
//		int a;
//		for(a=str.length()-1; a>=0;a--)
//			result+=str.charAt(a);
//			
//		
//		return result;
//	};
//	System.out.println(output.disp("Hackerearth"));
//	}
//	
//}

//que==13
//import java.util.HashMap;
//import java.util.Map;
//
//class aaaaa {
//	public static void main(String[] args) {
//	HashMap<Integer, String> map=new HashMap<Integer,String>();
//	map.put(1, "I");
//	map.put(2, "love");
//	map.put(3, "coding");
//	map.put(1, "I love coding on hacrerth");
//	for(Map.Entry m: map.entrySet()) {
//		System.out.println(m.getKey()+"  "+m.getValue());
//	}
//	}
//	
//}

//que==14
//abstract class Hack{
//	abstract void code();
//}
//
//class hackster extends Hack{
//	void code() {
//		
//		System.out.println("hackster loves to code on hackerearth");
//	}
//}
//class aaaaa {
//	public static void main(String[] args) {
//	Hack obj=new hackster() ;
//	}
//	
//}


//que==15
//public class aaaaa {
//	
//	static void hack1() {
//		System.out.println("i love coding");
//	}
//	public void hack2() {
//		System.out.println("i love coding on hackerearth");
//	}
//
//	public static void main(String[] args) {
//	hack1();
//	hack2();
//	}
//	
//}


//que==16
//class Hacker{
//	static int add(int a, int b) {
//		return a*b/a;
//	}
//	static int add(int a, int b, int c) {
//		return a*b/c;
//	}
//}
//
//public class aaaaa {
//
//	public static void main(String[] args) {
//	System.out.println((Hacker.add(4,6)));
//	System.out.println(Hacker.add(2,4,6));
//	}
//	
//}

//que==17
//import java.io.File;
//import java.io.IOException;
//public class aaaaa {
//
//	public static void main(String[] args) {
//	try {
//		File obj=new File("filename.txt");
//		if(obj.createNewFile()) {
//			System.out.println("file created: "+ obj.getName());
//		}else {
//			System.out.println("file already exist");
//		}
//		
//	} catch (IOException e) {
//		System.out.println("an error occured");
//		e.printStackTrace();
//	}
//	}
//	
//}



//que==18
//public class aaaaa {
//
//	public static void main(String[] args) {
//		int val=10;
//		if((val>10 ? val++:val--)<10) {
//			System.out.println("mac");
//		}
//		if(val<10)
//			System.out.println("pc");
//	}
//	
//}

//Que ==21
//interface NewFunc {
//	void callback();
//}
//
//public class aaaaa {
//
//	public static void main(String[] args) {
//		String str = "Hacking";
//		NewFunc callme = display(str);
//		str = "hack";
//		callme.callback();
//	}
//
//	public void display(String str) {
//		System.out.println(str + "  earth");
//	}
//}

//que=20
//public class aaaaa {
//static String strVal;
//	public static void main(String[] args) {
//		aaaaa a=new aaaaa();
//		strVal=a.getString("Program");
//		System.out.println("  "+strVal);
//	}
//
//	public static String getString(String str) {
//		StringBuffer strbuf=new StringBuffer();
//		for (int i = str.length()-1; i >0; i--) {
//			strbuf.append(str.charAt(i));
//			
//		}
//		return strbuf.toString();
//	}
//	
//}

