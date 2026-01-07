package example;
import java.util.Scanner;
import looping_statements.*;
public class PerfectNumberCheck {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	System.out.println(ForLoop.PerfectNumber(a));
	sc.close();
}
}
