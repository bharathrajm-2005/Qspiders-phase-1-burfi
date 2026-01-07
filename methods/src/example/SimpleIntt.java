package example;
import java.util.Scanner;

import method_overload.SimpleInt;
public class SimpleIntt {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	int p = sc.nextInt();
	int r = sc.nextInt();
	int t = sc.nextInt();
	int a=SimpleInt.si(p,r,t);
	System.out.println("Simple Interest is:"+a);
	sc.close();
}
}
