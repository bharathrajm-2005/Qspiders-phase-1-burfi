package example;

import java.util.Scanner;

public class Armstrong {
public static int CountTheDigits(int num) {
	int count=0;
	while(num>0) {
		count++;
		num/=10;
	}
	return count;
	
}
public static int PowerOfTheNumber(int base,int exp) {
	int num=1;
	for(int i=0;i<exp;i++) {
		num=num*base;
	}
	return num;
	
}
public static boolean ArmstrongOrNot(int num) {
	int temp=num;
	int exp=CountTheDigits(num);
	int sum=0;
	while(num>0) {
		int n=num%10;
		sum+=PowerOfTheNumber(n, exp);
		num/=10;
	}
	if(sum==temp) {
		return true;
	}
	else {
		return false;
	}
	
}

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	System.out.println(ArmstrongOrNot(num));
	sc.close();
	
}
}
