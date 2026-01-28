package stream_API;


import java.util.ArrayList;
import java.util.stream.Stream;

public class Demo_1 {
	
	public static void main(String[] args) {
//		Stream<Integer> of=Stream.of(1,2,3,4,5);
//		
//		of.forEach(i->System.out.println(i));
//		
//		Stream<String > s=Stream.of("Paras","Prasun","Meet","Ashwin");
//		s.forEach(j->System.out.println(j));
//		
		
		////////////////////   STream method use karun ata //////////////////////////////////
		
	    ArrayList<String> al=new ArrayList<String>();
	    al.add("Paras");
	    al.add("Meet");
	    al.add("Ashwin");
	    al.add("Prasun");
	    
	    Stream<String> streamMethod=al.stream();
	    streamMethod.forEach(i-> System.out.println(i));
	}

}