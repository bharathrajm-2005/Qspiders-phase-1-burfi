package example;
import java.util.*;
import decision_making.SwitchCase;
public class Evv {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(SwitchCase.EvenOrOdd(a));
		sc.close();
	}
}
