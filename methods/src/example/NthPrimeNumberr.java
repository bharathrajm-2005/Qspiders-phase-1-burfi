package example;
import java.util.Scanner;
public class NthPrimeNumberr {
public static boolean IsPrime(int a) {
	for(int i=2;i<a;i++) {
		if(a%i==0) {
			return false;
		}
	}
	return true;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a = sc.nextInt();
	int count=0;
	int i=2;
	while(i>0) {
		if(IsPrime(i)) {
			count++;
			if(count==a) {
				System.out.println(i);
			}
		}
		i++;
	}
	sc.close();
}
}