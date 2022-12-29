package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Arrylist_constTest {

	public static void main(String[] args) {
		List<Arrylist_constr>a=new ArrayList<>();
		Arrylist_constr a1=new Arrylist_constr("teja", 111, 24);
		Arrylist_constr a2=new Arrylist_constr("rocky", 222, 25);
		Arrylist_constr a3=new Arrylist_constr("ivana", 333, 24);


		a.add(a1);
		a.add(a2);
		a.add(a3);
		//		System.out.println(a1.getName()+" "+a1.getId()+" "+a1.getAge());
		//		System.out.println(a2.getName()+" "+a2.getId()+" "+a2.getAge());
		//		System.out.println(a3.getName()+" "+a2.getId()+" "+a2.getAge());
		for(Arrylist_constr ar:a) {
			System.out.println(ar.getName()+" "+ar.getId()+" "+ar.getAge());
//
		}
//		System.out.println(a.get(0).toString());
//		System.out.println(a.get(1).toString());
//		System.out.println(a.get(2).toString());

	}
}
