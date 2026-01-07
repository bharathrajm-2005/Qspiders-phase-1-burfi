package example;
import decision_making.*;
import java.util.*;
public class upperorlower {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	char c = sc.next().charAt(0);
	System.out.println(IfElse.uppercaseOrLowercase(c));
	sc.close();
}
}
