package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArylistEx1 {

	public static void main(String[] args) {
		ArrayList <String > l=new ArrayList<String>();
		l.add("apple");
		l.add("banana");
		l.add("strewberry");
		l.add("pineapple");
		//		System.out.println(l);
		//		for(String str:l) {	
		//			System.out.println(str);
//		Iterator itr=l.iterator();//getting the Iterator  
//		while(itr.hasNext()){
//
//		
//		System.out.println(itr.next());
		
//		it will return the 2nd element, because index starts from 0  
				  //changing the element  
		
//		System.out.println(l.get(1));

		for(String str:l) {
			System.out.println(str);
			
			l.set(1, "guava");

	
			}
		System.out.println("******************************");
		}
	}
