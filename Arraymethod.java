package arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.zip.Inflater;

public class Arraymethod {

	public static void main(String[] args) {
		ArrayList<Integer>a1=new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		//		System.out.println(a1);
		ArrayList<Integer>a2=new ArrayList<Integer>();
		a2.add(10);
		a2.add(20);
		a2.add(30);
		a2.add(40);
		a2.add(60);
				System.out.println(a2);
		//		a1.addAll(a2);
		//		System.out.println(a1);
		//		a1.addAll(1,a2);
		//		System.out.println(a2);
				a1.addAll(a2);
				System.out.println(a1);
		//a1.remove(a2);
	//	System.out.println(a1);

	}

}
