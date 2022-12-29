package arraylist;

import java.io.LineNumberReader;
import java.io.NotActiveException;
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;
import javax.xml.stream.events.EndDocument;

public class Array_withouttext {

	public static void main(String[] args) {
		//		String name[]= {"user1","user2","user3","user4","user5","user6","user7"};
		//		Scanner sc=new Scanner(System.in);
		//		System.out.println("enter the names");
		//
		//		String input=sc.next();
		//		boolean found=false;
		//		for(String data:name) {
		//			if(input.equals(data)) {
		//				found =true;
		//				break;
		//			}
		//		}
		//		if(found) {
		//			System.out.println("input: is available");
		//		}else {
		//			System.out.println("input :is not available");
		//
		//		}

		//		String name[]= {"teja","rocky","sravani","shankar","ivana","saaho","harsha"};
		//		Scanner sc =new Scanner(System.in);
		//		System.out.println("enter the names");
		//		String input =sc.next();
		//		boolean found=false;
		//		for(String data:name) {
		//			if(input.equals(data)) {
		//				found =true;
		//				break;
		//			}
		//		}
		//		if(found) {
		//			System.out.println("iput:Is a avaialble");
		//		}
		//		else {
		//			System.out.println("input:is Not avalble");
		//		}

		//								Assignment integer

		int number[]= {1,3,5,7,9,11,13};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the input number");
		int input=sc.nextInt();
		boolean found=false;
		for(int data:number) {
			if(input==data) {
				found= true;
				break;
			}
		}
		if(found) {
			System.out.println("Is available");		
		}
		else {
			System.out.println("not available ");
		}

	}
}
















