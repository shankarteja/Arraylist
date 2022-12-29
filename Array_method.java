 package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.Inflater;

public class Array_method {

	public static void main(String[] args) {
		ArrayList<Integer>b1=new ArrayList<Integer>();
		b1.add(10);
		b1.add(20);
		b1.add(30);
		b1.add(40);
		b1.add(50);
		b1.add(60);
		//		System.out.println(b1);
		//		b1.add(1, 100);
		//		b1.add(5, 500);
		//		System.out.println(b1);

		ArrayList<Integer>b2=new ArrayList<Integer>();
		b2.add(40);
		b2.add(50);
		b2.add(60);

		//		b1.addAll(b2);
		//		System.out.println(b1);
		//		b1.addAll(1, b2);    
		//		System.out.println(b1);
		//		b1.removeAll(b2);
		//		System.out.println(b1);
		//		b1.add(70);
		//		System.out.println(b1);
		//					b1.retainAll(b2);
		//					System.out.println(b1);
		//			System.out.println(b1.contains(70)); //false
		//
		//			System.out.println(b1.contains(60));

		//		System.out.println(b1.getClass());
		//						b1.set(1,200);
		//						System.out.println(b1);
		//		System.out.println(b1.indexOf(70));
		//		System.out.println(b1.indexOf(60));
		//		System.err.println(b2.indexOf(40));
		System.out.println(b1.size());
		System.out.println(b1.subList(1, 5));// its contains data choose particular  some data 
		System.out.println(b1.subList(2, 4));
	}

}
