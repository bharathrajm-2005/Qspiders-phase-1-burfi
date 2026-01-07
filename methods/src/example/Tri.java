package example;
import decision_making.ElseIfLadder;
import java.util.*;
public class Tri {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.println(ElseIfLadder.TriangleType(a, b, c));
		sc.close();
	}
}
