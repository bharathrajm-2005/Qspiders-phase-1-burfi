package looping_statements;
import java.util.*;
public class NthFibannociNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=0;
	int b=1;
	int i=3;
	int count =sc.nextInt();
	if(count==1) {
		System.out.println(0);
	}
	if(count==2) {
		System.out.println(1);
	}
	
	while(i>2) {
		int num=a+b;
		if(i==count) {
			System.out.println(num);
			break;
		}
		i++;
		a=b;
		b=num;
	}
	sc.close();
}
}
