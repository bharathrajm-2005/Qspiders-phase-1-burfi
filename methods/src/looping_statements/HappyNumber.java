package looping_statements;
import java.util.*;
public class HappyNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	if(HappyNumberCheck(a)) {
		System.out.println(true);
	}
	else
		System.out.println(false);
	sc.close();
}
public static boolean HappyNumberCheck(int a) {
	int n=a;
	int m=a;
	do {
		n=Square(n);
		m=Square(Square(m));
		if(m==1) {
			return true;
		}
	}while(n!=m);
	return false;
}
public static int Square(int a) {
	int sum=0;
	while(a>0) {
		int n=a%10;
		sum+=n*n;
		a/=10;
	}
	return sum;
}
}
