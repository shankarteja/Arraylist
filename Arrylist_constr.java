package arraylist;

public class Arrylist_constr {
	
	String name;
	private int id;
	private int age;
	public Arrylist_constr(String name, int id, int age) {
	
		this.name = name;
		this.id = id;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	
	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		return " " + name + ", " + id + ", " + age + "";
	}

	}
	
	




