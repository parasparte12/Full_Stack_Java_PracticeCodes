package function_3;

import java.util.function.Function;

public class Function_3 {
	public static void main(String[] args) {
//		Function<Integer,Integer> f=(i)->i;
//		System.out.println(f.apply(10));
		
//		Function<Integer, String>f=(i)->"Paras";
//		System.out.println(f.apply(10));//			In this we donot get 10 
//		
		
		Function<Integer, String>f=(i)->
		{
			return String.valueOf(i);
		};
		System.out.println(10);  //Here we get 10
	}

}
