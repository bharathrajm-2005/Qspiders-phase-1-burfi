package example;

public class PrimeStrict {
public static boolean isPrime(int a) {
	for(int i=2;i<a;i++) {
		if(a%i==0) {
			return false;
		}
	}
	return true;
}
public static boolean StrictlyIncreasing(int a) {
	int temp=10;
	while(a>0) {
		int n=a%10;
		if(n<temp)
			temp=n;
		else
			return false;
		a=a/10;
	}
	return true;
}
public static void main(String[] args) {
	for(int i=2;i<100;i++) {
		if(StrictlyIncreasing(i)&&isPrime(i)) {
			System.out.println(i);
		}
	}
}
}
