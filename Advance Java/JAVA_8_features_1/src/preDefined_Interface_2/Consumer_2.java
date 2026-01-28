package preDefined_Interface_2;
import java.util.ArrayList;
import java.util.function.Consumer;


public class Consumer_2 {
	public static void main(String[] args) {
		
		Consumer<ArrayList<Integer>> c=(i)->{
			i.forEach((x)->System.out.println(x)) ;
			
		}; 
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(2);
		al.add(20);
		System.out.println(al);
	}
	
	
	

}
