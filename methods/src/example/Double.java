package example;
import java.util.*;
import looping_statements.*;
public class Double {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int arr=sc.nextInt();
	System.out.println(ForLoop.NumberOfPrimeFactors(arr));
	sc.close();
}
}