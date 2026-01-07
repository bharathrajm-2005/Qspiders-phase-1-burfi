package example;
import java.util.*;
public class PerfectNumberr {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int count=0;
	for(int i=1;i<a;i++) {
		if(a%i==0) {
			count+=i;
		}
	}
	if(count==a)
	System.out.println(true);
	else
		System.out.println(false);
	sc.close();
}
}