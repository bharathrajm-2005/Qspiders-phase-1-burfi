package java_test;

public class JavaTestNumbers {
public static boolean TechNumber(int a) {
	int c=CountDigits(a);
	int temp =a;
	int b=c/2;
	int half=0;
	while(b>0) {
		int n=a%10;
		half=half*10+n;
		a/=10;
		b--;
	}
	int half1=0;
	while(half>0) {
		int n=half%10;
		half1=half1*10+n;
		half/=10;
	}
	int sum=half1+a;
	int d=sum*sum;
	return(d==temp);
	
	
}
public static int CountDigits(int a) {
	int count=0;
	while(a>0) {
		count++;
		a/=10;
	}
	return count;
}
public static int SquareAndSum(int a) {
	int sum=0;
	while(a>0) {
		int n=a%10;
		sum+=n*n;
		a/=10;
	}
	return sum;
}
public static boolean HappyNumber(int a) {
	while(a!=1&&a!=4) {
		a=SquareAndSum(a);
	}
	return a==1;
}
public static boolean BouncyNumber(int a) {
	boolean down=false;
	boolean up=false;
	int lastDigit=a%10;
	a/=10;
	while(a>0) {
		int currentDigit=a%10;
		if(currentDigit<lastDigit) {
			up=true;
		}
		else if(currentDigit>lastDigit) {
			down =true;
		}
		lastDigit=currentDigit;
		a/=10;
	}return(up&&down);
}
public static int[] EvenOddSwap(int[]a) {
	int n=a.length;
	int i=0;
	int j=n-1;
	while(i<j) {
		if(a[i]%2!=0) {
			if(a[j]%2==0) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
				j--;
			}
			else {
				j--;
			}
		}
		else {
			i++;
		}
	}
	return a;
}
public static int SubArrayWithKMost(int[]a,int k) {
	int n=a.length;
	int i=0;
	int max=0;
	int count=0;
	for(int j=0;j<n;j++) {
		if(a[j]%2!=0) {
			count++;
		}
		while(count>k) {
			if(a[i]%2!=0) {
				count--;
			}
			max=Math.max(max, (j-i+1));
			i++;
		}
	}
	return max;
	
}
}
