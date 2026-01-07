package method_overload;

public class Avgg {
public static void main(String[] args) {
	hello obj = new hello();
	obj.Cello("Raju");
	obj.shinoAburame(2023838);
	obj.senju(18);
	obj.dilema("CSE");
	hello obj2 = new hello();
	System.out.println();
	obj2.Cello("kaju");
	obj2.shinoAburame(2023839);
	obj2.senju(18);
	obj2.dilema("ECE");
}
}
class hello{
	int rollNumber;
	String Name;
	short age;
	String department;
	public void Cello(String name) {
		System.out.println("Hello! : "+name);
	}
	public void shinoAburame(int rno) {
		System.out.println("The roll number is : "+rno);
	}
	public void senju(int i) {
		System.out.println("The age is : "+i);
	}
	public void dilema(String dept) {
		System.out.println("The department : "+dept);
	}
}
