package example;
import java.util.*;
public class demo1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println(CircularPrime(197));
	sc.close();
}
public static boolean CircularPrime(int a) {
	int digits=0;
	int temp=a;
	if(!IsPrime(a)) {
		return false;
	}
	while(a>0) {
		digits++;
		a/=10;
	}
	int pow=1;
	for(int i=1;i<digits;i++) {
		pow=pow*10;
	}
	for(int i=0;i<digits-1;i++) {
		int n = temp%10;
		n=n*pow;
		temp/=10;
		n+=temp;
		if(!IsPrime(n))return false;
		temp=n;
	}
	return true;
}
public static boolean IsPrime(int a) {
	for(int i=2;i<a;i++) {
		if(a%i==0) {
			return false;
		}
	}
	return true;
}
}