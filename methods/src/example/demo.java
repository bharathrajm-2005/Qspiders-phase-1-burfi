package example;
import java.util.*;
public class demo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println(KaprekarNumber(100));
	sc.close();
}
public static boolean KaprekarNumber(int a) {
	int sum=a*a;
	int squareNum=sum;
	int number=a;
	int sum1=0;
	int countdigit=0;
	int m=0;
	while(sum>0) {
		countdigit++;
		sum/=10;
	}
	int countDigitHalf=0;
	if(countdigit%2==0)
		countDigitHalf=countdigit/2;
	else
		countDigitHalf=(countdigit+1)/2;
	for(int i=0;i<countDigitHalf;i++) {
		int n=squareNum%10;
		m=m*10+n;
		squareNum/=10;
	}
	while(m>0) {
		int n=m%10;
		sum1=sum1*10+n;
		m/=10;
	}
	return squareNum+sum1==number;
}
}
