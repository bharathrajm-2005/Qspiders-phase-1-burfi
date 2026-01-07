package example;
import decision_making.ElseIfLadder;
import java.util.*;
public class EmployeeSalary {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Gender M/F : ");
		char c = sc.next().charAt(0);
		System.out.println("Enter the Years of service : ");
		int yos = sc.nextInt();
		System.out.println("Qualification :(PG/UG) ");
		String q=sc.next();
		System.out.println("Salary is : "+ElseIfLadder.salaryAllotment(c, yos, q));
		sc.close();
	}
}
