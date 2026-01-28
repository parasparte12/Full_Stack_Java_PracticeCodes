package calculator;

public class Calculator_1 {
	public static void calculator(AO_2 ao) {//ao is reference class of AO_2 
		
		ao.calculator(200, 100);
		
	}
	public static void main(String[] args) {
//		Addition_3 add=new Addition_3();
//		calculator(add);
		
		//Functional programming 
		calculator(( a, b)->System.out.println("Addition is ="+(a+b)));
	}
	 
	//no need to give data type like int a,vegre
	 //copy paste from Addition_3 
	//Does not need any Addition class so we delete it 
	//calculator(( a, b)->System.out.println("Addition is ="+(a+b)));=====This is also called as lambda  

}
