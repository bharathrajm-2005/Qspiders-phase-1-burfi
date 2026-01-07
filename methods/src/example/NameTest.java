package example;
import java.util.Scanner;

import looping_statements.*;
public class NameTest {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println(1/10);
	int a= sc.nextInt();
	WhileLoop.MultiNamePrinter(a);
	ForLoop.MultiNamePrinter(a);
	sc.close();
	}
}
