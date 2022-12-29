package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist_name {

	public static void main(String[] args) {
		ArrayList<String>a1=new ArrayList<String>();
		while (true) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the names");
			String str=sc.nextLine();
			if ("end".equals(str)) {
				break;
			}
			if (!a1.contains(str)) {
				a1.add(str);

			}

		}
		System.out.println("********************************************");
		for(String str:a1) {
			System.out.println(str);

		}
	}
}

//		Assignment with size
//		ArrayList<Integer> b1=new ArrayList<Integer>();
//		while(true) {
//			Scanner sc=new Scanner(System.in);
//			System.out.println("enter the number");
//			int i=sc.nextInt();
//			if("end".equals(i)) {
//				break;
//
//			}
//			if(!b1.contains(i)) {
//				b1.add(i);
//
//			}
//
//		}
//		System.out.println("***********************************************");
//		for(int a:b1) {
//			System.out.println(a);		
//		}




