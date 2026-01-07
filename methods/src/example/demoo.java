package example;
import java.util.*;
public class demoo {
public static boolean isPrime(int a) {
	for(int i=2;i<a;i++) {
		if(a%i==0) {
			return false;
		}
	}
	return true;
	
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the starting of the range:");
	int a=sc.nextInt();
	System.out.println("Enter the ending of the range:");
	int b=sc.nextInt();
	int count=0;
	System.out.println("Enter the nth number:");
	int num =sc.nextInt();
	for(int i=a;i<b;i++) {
		if(isPrime(i)) {
			count++;
			if(count==num) {
				System.out.println("The nth prime number is: "+i);
			}
		}
	}
	sc.close();
}

}
