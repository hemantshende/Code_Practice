package Lambdas;

public class Client_for_custom_functional_interface {

	public static void main(String[] args) {
		// 
		
		Custom_Functional_Interface add= (a,b)->{  //we use lambdas here...java will take care of object creation
			return a+b;
		};
		
		Custom_Functional_Interface sub= (a,b)->{
			return a-b;
		};
		
		Custom_Functional_Interface mul= (a,b)->{
			return a*b;
		};
		
		Custom_Functional_Interface div= (a,b)->{
			return a/b;
		};
		
		
		System.out.println(add.operation(122, 8));
		System.out.println(sub.operation(122, 8));
		System.out.println(mul.operation(122, 8));
		System.out.println(div.operation(122, 8));


	}

}
