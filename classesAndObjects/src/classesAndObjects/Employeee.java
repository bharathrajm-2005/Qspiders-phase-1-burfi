package classesAndObjects;
import java.util.*;
public class Employeee {
	String name;
	double salary;
	int id;
 Employeee(int id,String name,double salary) {
	this.id=id;
	this.name=name;
	this.salary=salary;
}
 public void printDetails() {
	double grossSalary=salary + salary*(0.2)+salary*(0.4);
	System.out.println(grossSalary);
}
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name of the Employee : ");
	String name=sc.nextLine();
	System.out.println("Enter the ID of the Employee : ");
	int id=sc.nextInt();
	System.out.println("Enter the Salary of the Employee : ");
	double salary=sc.nextInt();
	Employeee obj = new Employeee(id,name,salary);
	obj.printDetails();
	sc.close();
}
}
