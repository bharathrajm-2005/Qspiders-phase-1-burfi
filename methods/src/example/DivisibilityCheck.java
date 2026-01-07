package example;
import decision_making.*;
import java.util.*;
public class DivisibilityCheck {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the target number:");
	int a = sc.nextInt();
	System.out.println("Enter the First number:");
	int b = sc.nextInt();
	System.out.println("Enter the secound number:");
	int c = sc.nextInt();
	System.out.println(ElseIfLadder.divisibilityByTwoNumbers(a, b, c));
	sc.close();
}
}
