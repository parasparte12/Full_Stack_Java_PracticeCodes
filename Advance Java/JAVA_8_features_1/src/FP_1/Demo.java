package FP_1;

import java.util.Arrays;

public class Demo {
	public static void main(String[] args) {
		//////Interface for only single abstract method//////
//		Test t=()->{
//			System.out.println(10+10);
//			
//		};
//		t.add();
		
//		Test t=(i)->{
//			int sum=0;
//			for(int x:i) {//iterate 
//				sum+=x;
//				
//			}
//			System.out.println("Sum is ="+sum);
//			
//		};
//		int [] xyz= {1,2,3,4};
//		
//		t.sum(xyz);
		//////Generic INterface///////
		
//		Test<Integer> t=(i,j)->System.out.println(i+j);
//		t.add(10, 20);
		
//		=======================================//
		
		
//		Test<String> t=(i,j)->System.out.println(i+j);
//		t.add("Paras ", " Parte");
//		
//		Test<String> c=(i,j)->System.out.println(i+j);
//		c.add("Hiiiiiii ", " Lavdyaaaaa");
//		
//		Test<int []> b=(i,j)->System.out.println(Arrays.toString(i)+" "+Arrays.toString(j));
//		b.add(new int [] {1,2,3,4,},new int [] {6,7,8,9});
		
		//==============================================
		
		////////For different data types ///////////////////////
		
		Test<String,Integer> t=(i,j)->System.out.println(i+j);
		t.add("Paras ", 3);
	}

}
