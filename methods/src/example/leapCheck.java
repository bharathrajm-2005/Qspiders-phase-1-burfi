package example;
import decision_making.*;
import java.util.*;
public class leapCheck {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	System.out.println(IfElse.leapYear(a));
	sc.close();
}
}
