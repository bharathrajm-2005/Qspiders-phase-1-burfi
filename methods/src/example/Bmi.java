package example;
import decision_making.ElseIfLadder;
import java.util.*;
public class Bmi {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double a = sc.nextDouble();
		System.out.println(ElseIfLadder.BmiCategory(a));
		sc.close();
	}
}