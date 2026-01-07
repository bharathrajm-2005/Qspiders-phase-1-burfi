package example;
import java.util.*;
public class TestDay11 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=Count(a);
	int num =0;
	int num1=0;
	int ans=0;
	if(b%2!=0) {
		System.out.println(false);
		
	}
	else {
		int c=b/2;
		for(int i=0;i<c;i++) {
			int n=a%10;
			num=num*10+n;
			a/=10;
		}
		while(num>0) {
			int n=num%10;
			num1=num1*10+n;
			num/=10;
		}
		for(int i=0;i<b/2;i++) {
			num1*=10;
		}
		ans=num1+a;
		System.out.println(ans);
	}
	sc.close();
	
}
public static int Count(int a) {
	int b=0;
	while(a>0) {
		b++;
		a/=10;
	}
	return b;
}
}
