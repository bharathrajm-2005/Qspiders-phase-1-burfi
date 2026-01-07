package looping_statements;

public class WhileLoop {
	public static void MultiNamePrinter(int a) {
		int i =0;
		while(i<a) {
			System.out.println("Bharath Raj M");
			i++;
		}
		
	}
	public static void amstrong(int a) {
		int sum=0,count=0;
		int temp=a;
		while(a>0) {
			int num = a%10;
			sum=sum+(num*num*num);
			a=a/10;
			count++;
		}
		if(temp==sum) {
			System.out.println("True");
		}
		System.out.println(count);
	}
	public static long ReverseNumber(long a) {
		long rev=0L;
		while(a>0) {
			long num = a%10;
			rev=rev*10+num;
			a=a/10;
		}
		return rev;
	}
	public static int CountOfDigits(int a) {
		int count=0;
		while(a>0) {
			a/=10;
			count++;
		}
		return count;
		
	}
	public static boolean isPrime(int num) {
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
		
	}
	public static int NthPrimeNumber(int num) {
		int a=0;
		int i=2;
		while(true) {
			if(isPrime(i)) {
				if(a==num) {
					return i;
				}
				a++;
			}
			i++;
		}
	}
	public static int NthOddNumber(int num) {
		int i=1;
		int count=1;
		while(true) {
			if(i%2!=0) {
				if(count==num) {
					return i;
				}
				count++;
			}
			i++;
		}
	}
	
}