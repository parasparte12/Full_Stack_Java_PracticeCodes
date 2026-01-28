package preDefined_Interface_2;
import java.util.function.Predicate;

public class Predicate_1 {
	
	public static void main(String[] args) {
//		Predicate<Integer> p=(i)->true;/////////////// true/false/i>any number/wiese versa
//		
//		boolean test=p.test(12);
//		System.out.println(test);
		
		
		String [] names= {"Paras","Meet","Prasun","Ashwin"};
		Predicate<String> p=(name)->name.startsWith("P");
		
		for(String name:names)
		{
			if(p.test(name))
			{
				System.out.println(name);
			}
		}
		
	}

}
