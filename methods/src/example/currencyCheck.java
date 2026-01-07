package example;
import decision_making.*;
import java.util.*;
public class currencyCheck {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Amount:");
	int a = sc.nextInt();
	System.out.println(ElseIfLadder.currencyNoteDivider(a));
	sc.close();
}
}