package Generics;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pair p=new Pair();
		p.first="hemant";
		p.second= 32.56;
		p.first= 54;
		System.out.println(p.first+"  "+p.second);
//		this Pair class is to flexible coz we use Object there anyone can 
//		change string value to any other datatype.
		
		
//		generic pair with one argument
		GenericPair<Integer> gp=new GenericPair<>();
		
//		gp.first="Hemant"; //this is not allowed
		gp.first=34;
		System.out.println(gp);
		
		
//		generic pair wit 2 arg
		
		GenericsPair2<Integer, String> pair= new GenericsPair2<>();
		pair.first=34;
		pair.second="abc";
		
		System.out.println(pair);
		
		pair.doSomething("hemant");
		int ans= pair.doSomething1(34);
		pair.doSomething3("India");
		
	}
}
