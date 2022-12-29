package arraylist;

import java.lang.invoke.StringConcatFactory;

public class Testperson {

	public static void main(String[] args) {
	Person[] x=new Person[5];
	x[1]=new Person(11, "rocky");
	x[2]=new Person(12, "teja");
	x[3]=new Person(13, "sravani");
	x[4]=new Person(14, "ivana");
	x[0]=new Person(15, "sandy");
	for(Person p:x) {
//		System.out.println(p);
		System.out.println(p.id+" "+p.name);
		
	}
	
	}

}
