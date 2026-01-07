package example;
import java.util.Scanner;

import decision_making.SwitchCase;
public class DayOfTheWeek1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a=sc.nextInt();
	System.out.print("The day is "+SwitchCase.DayOfTheWeek(a));
	sc.close();
}
}
