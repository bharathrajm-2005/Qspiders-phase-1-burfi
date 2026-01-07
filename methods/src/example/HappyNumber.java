package example;
import java.util.Scanner;
public class HappyNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	System.out.println(HappyNumberCheck(a));
	sc.close();
}
public static boolean HappyNumberCheck(int a) {
	while(a!=1&&a!=4) {
		a=SquareAndSum(a);
	}
	return a==1;
}
public static int SquareAndSum(int a) {
	int sum=0;
	
	while(a>0) {
		int n=a%10;
		sum=sum+n*n;
		a/=10;
	}return sum;
}
}
