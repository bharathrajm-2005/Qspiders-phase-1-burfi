package example;
import java.util.*;
public class decision {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number");
		int a = sc.nextInt();
		if(a>0) {
			System.out.println("The number is positive");
		}
		System.out.println("Hello");
		sc.close();
	}
}
