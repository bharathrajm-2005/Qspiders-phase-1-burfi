package example;
import java.util.*;
public class Double1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println(SmithNumber(22));
	sc.close();
}
public static boolean SmithNumber(int a) {
	int count=0;
	int sum=0;
	int b=a;
	int k=a;
	while(b>0) {
		int n=b%10;
		count+=n;
		b/=10;
	}
	for(int i=2;i<a;i++) {
		if(a%i==0&&IsPrime(i)) {
			
			while(k%i==0) {
				sum+=SumOfDigits(i);
				k/=i;
			}
			
		}
	}
	return count==sum;
	
}
public static boolean IsPrime(int a) {
	for(int i=2;i*i<a;i++) {
		if(a%i==0) {
			return false;
		}
	}
	return true;
}
public static int SumOfDigits(int a) {
	int count=0;
	while(a>0) {
		int n=a%10;
		count+=n;
		a/=10;
	}
	return count;
}
}