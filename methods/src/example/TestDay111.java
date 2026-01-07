package example;
import java.util.*;
public class TestDay111 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	System.out.println(XylemPholem(a));
	sc.close();
}
public static boolean XylemPholem(int a) {
	int ld=a%10;
	a/=10;
	int sum=0;
	while(a>10) {
		int n=a%10;
		sum+=n;
		a/=10;
	}
	int b=ld+a;
	if(sum==b) {
		return true;
	}
	else
		return false;
}
}
