package classesAndObjects;

public class Constructors {
public static void main(String[] args) {
	emp obj = new emp("Ram",1002,23);
	emp obj1 = new emp("mar",1002,23);
	emp obj2= new emp("fair",1002,23);
	obj1.display();
	obj2.display();
	obj.display();
}
}
class emp{
	int age;
	int id;
	String name;
	emp(String name,int id,int age){
		this.name=name;
		this.id=id;
		this.age=age;
	}
	public void display() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(age);
	}
}