package example;
import java.util.Scanner;

import decision_making.ElseIfLadder;
public class QuadCheck {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		ElseIfLadder.QuadraticRoots(a, b, c);
		sc.close();
		
	}

}
