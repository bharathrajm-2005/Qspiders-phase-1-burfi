package classesAndObjects;
import java.util.*;
public class Classes {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Employee obj1=new Employee();
	Employee obj2=new Employee();
	Employee obj3=new Employee();
	
	int i = 1;
	
	
	System.out.println("Enter the details of "+i+" Employee");
	System.out.print("Name : ");
	obj1.name=sc.nextLine();
	
	System.out.print("Id : ");
	obj1.id=sc.nextInt();
	sc.nextLine();
	
	System.out.print("Age : ");
	obj1.age=sc.nextInt();
	sc.nextLine();
	
	
	i++;
	
	
	System.out.println("Enter the details of "+i+" Employee");
	System.out.print("Name : ");
	obj2.name=sc.nextLine();
	
	System.out.print("Id : ");
	obj2.id=sc.nextInt();
	sc.nextLine();
	
	System.out.print("Age : ");
	obj2.age=sc.nextInt();
	sc.nextLine();
	
	
	i++;
	System.out.println();
	
	
	System.out.println("Enter the details of "+i+" Employee");
	System.out.print("Name : ");
	obj3.name=sc.nextLine();
	System.out.print("Id : ");
	obj3.id=sc.nextInt();
	sc.nextLine();
	System.out.print("Age : ");
	obj3.age=sc.nextInt();
	sc.nextLine();
	
	
	obj1.Working();
	System.out.println();
	obj2.Working();
	System.out.println();
	obj3.Working();
	sc.close();
	
}
}


class Employee{
	int id;
	String name;
	int age;
	public void Working() {
		System.out.println("Id of the employee : "+id);
		System.out.println("Name of the employee : "+name);
		System.out.println("Age of the employee : "+age);
	}
}