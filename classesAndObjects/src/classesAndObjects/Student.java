package classesAndObjects;

public class Student {
	{
		System.out.println("Student details \n");
	}
	double id=Math.random()*100+100;
	String name;
	int mark;
public Student(String name,int mark) {
	this.name=name;
	this.mark=mark;
}
public void displayTheDetais() {
	System.out.println("ID : "+(int)id);
	System.out.println("Name : "+name);
	System.out.println("Mark : "+mark);
}
public static void main(String[] args) {
	Student obj=new Student("Bharath",100);
	obj.displayTheDetais();
	obj.displayTheDetais();
	obj.displayTheDetais();
	
}
}
