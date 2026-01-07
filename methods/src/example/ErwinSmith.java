package example;
import java.util.Scanner;
public class ErwinSmith {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int sum=SumOfTheDigits(a);
	int sum1=0;
	if(!IsPrime(a)) {
		for(int i=2;i<a;i++) {
			if(a%i==0&&IsPrime(i)) {
				int k=a;
				while(k%i==0) {
					sum1+=SumOfTheDigits(i);
					k/=i;
					
				}
				
			}
		}
	}
	else System.out.print("");
	System.out.println(sum==sum1);
	sc.close();
	
}
public static int SumOfTheDigits(int a) {
	int sum=0;
	while(a>0) {
		int n=a%10;
		sum+=n;
		a/=10;
	}
	return sum;
}
public static boolean IsPrime(int a) {
	 if (a <= 1) return false;
	for(int i=2;i<a;i++) {
		if(a%i==0) {
			return false;
		}
	}
	return true;
}
}
