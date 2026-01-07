package example;
import java.util.Scanner;
import decision_making.ElseIfLadder;
public class SalaryCalculator {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Eneter the amount of salary:");
	int a = sc.nextInt();
	System.out.println("Enter the Number of years in service:");
	int b = sc.nextInt();
	System.out.println("The salary is: "+ElseIfLadder.GrossSalaryCalculator(a, b));
	sc.close();
	int c = 10;
	int h =0;
		do {
		 System.out.println(h++);
		 c++;
		}while(c<=20);
	
	}
}