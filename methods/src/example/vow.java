package example;
import java.util.*;
public class vow {
	public static String check(char c) {
		int a = (int)c;
		if(97<=a&&a<=122) {
			return "Lower case";
		}
		else {
			return "Upper case";
		}
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		char a = sc.next().charAt(0);
		System.out.println((int)a);
		System.out.println(check(a));
		sc.close();
	}
}
