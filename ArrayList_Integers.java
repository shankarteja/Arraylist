package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Integers {

	public static void main(String[] args) {
		ArrayList<Integer> objArrayList = new ArrayList<>();
		while (true) {
			Scanner objScanner = new Scanner(System.in);
			System.out.println("enter your choice of number");
			Integer i = objScanner.nextInt(); 
			if (i==0) {
				System.out.println("===============*data*==============\n"+objArrayList);
				break;
			}
			if(!objArrayList.contains(i)){
				objArrayList.add(i);
			}
			 
		}
		
	}

}
