package looping_statements;
public class ForLoop {
public static  void MultiNamePrinter(int a) {
	for(int i=0;i<a;i++) {
		System.out.println("Bharath Raj M");
	}
}
public static int SquareAndSum(int a) {
	int b=a*a;
	int sum=0;
	while(b>0) {
		int n=b%10;
		sum+=n;
		b/=10;
	}
	return sum;
}
public static int CountNum(int a) {
	int c=0;
	while(a>0) {
		c++;
		a/=10;
	}
	return c;
}
public static void amstrong(int a) {
	int sum=0,count=0;
	int temp=a;
	for(int i=a;i>0;i/=10) {
		int num = i%10;
		sum+=(num*num*num);
		count++;
	}
	if(temp==sum) {
		System.out.println("True");
	}
	System.out.println(count);
}
public static boolean PrimeOrNot(int a) {
	for(int i=2;i<a;i++) {
		if(a%i==0) {
			return false;
		}
	}
	return true;
}
public static int Factorial(int a) {
	int num =1;
	for(int i=a;i>0;i--) {
		num = num *i;
	}
	return num;
}
public static int DigitsOfNumber(int a) {
	for(int i=a;i>0;i/=10) {
		int num = i%10;
		System.out.println(num);
	}
	return 0;
}
public static int EvenDigitsOfNumber(int a) {
	for(int i=a;i>0;i/=10) {
		int num = i%10;
		if(num%2==0)
		System.out.println(num);
	}
	return 0;
}
public static int OddDigitsOfNumber(int a) {
	for(int i=a;i>0;i/=10) {
		int num = i%10;
		if(num%2!=0)
		System.out.println(num);
	}
	return 0;
}
public static int SumOfTheDigits(int a) {
	int sum=0;
	for(int i=a;i>0;i/=10) {
		int num = i%10;
		sum+=num;
	}
	return sum;
}
public static int ReverseOfTheDigits(int a) {
	int sum=0;
	for(int i=a;i>0;i/=10) {
		int num = i%10;
		sum=sum*10+num;
	}
	return sum;
}
public static int ProductOfTheDigits(int a) {
	int sum=1;
	for(int i=a;i>0;i/=10) {
		int num = i%10;
		sum=sum*num;
	}
	return sum;
}
public static void FibanocciSeries(int n) {
	int a=0,b=1;
	int sum=0;
	System.out.println(a+"\n"+b);
	for(int i=0;i<n-2;i++) {
		sum=a+b;
		a=b;
		b=sum;
		
		System.out.println(sum);
	}
	
}
public static void RangeFibanocciSeries(int a,int b) {
	int x=0,y=1;
	if(x>=a&&x<=b) {
		System.out.println(x);
	}
	if(y>=a&&y<=b) {
		System.out.println(y);
	}
	for(int i=a;i<b;i++) {
		int num = x+y;
		if(num>a) {
			System.out.println(num);
		}
		if(num>b) {
			break;
		}
		x=y;
		y=num;
		
	}
}
public static void PrimeNumbersInRange(int a,int b) {
	int sum=0;
	for(int i=a;i<b;i++) {
		if(isPrime(i)) {
			System.out.println(i);
			sum+=i;
		}
	}
	System.out.println(sum);
}
public static void PrimeNumbersInReverse(int a,int b) {
	for(int i=b;i>a;i--) {
		if(isPrime(i)) {
			System.out.println(i);
		}
	}
}
public static boolean isPrime(int num) {
	for(int i=2;i<num;i++) {
		if(num%i==0) {
			return false;
		}
	}
	return true;
	
}
public static void NumberOfPrimes(int a,int b,int c) {
	for(int i =a;i<b;i++) {
		if(c>0) {
			if(isPrime(i)) {
				System.out.println(i);
				c--;
			}
		}
	}
}
public static int PowerOfTheDigit(int a,int b) {
	int num=1;
	for(int i =0;i<b;i++) {
		num=num*a;
	}
	return num;
}
public static int SumOfFactors(int a) {
	int sum=0;
	for(int i=1;i<a;i++) {
		if(a%i==0) {
			sum+=i;
		}
	}
	return sum;
}
public static boolean PerfectNumber(int a) {
	int b=SumOfFactors(a);
	if(a==b) {
		return true;
	}
	return false;
}
public static boolean PerfectNumberVerifier(int num) {
	int sum=0;
	for(int i=1;i<num;i++) {
		if(num%i==0) {
			sum+=i;
		}
	}
	return sum==num;
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
public static boolean AutoMorphic(int a) {
	int b= a*a;
	int sum =0;
	int sum1 =0;
	int count=CountNum(a);
	while(count>0) {
		int n=b%10;
		sum=sum*10+n;
		b/=10;
		count--;
	}
	while(sum>0) {
		int n=sum%10;
		sum1=sum1*10+n;
		sum/=10;
	}
	if(a==sum1) {
		return true;
	}
	else
		return false;
}
public static boolean NeonNumber(int a) {
	int sum=0;
	int temp=a;
	int b=a*a;
	while(b>0) {
		int n=b%10;
		sum+=n;
		b/=10;
	}
	return sum==temp;
}
public static boolean TwistedNumber(int a) {
	for(int i=2;i<a;i++) {
		if(a%i==0) {
			return false;
		}
	}
	int num =0;
	while(a>0) {
		int n=a%10;
		num=num*10+n;
		a/=10;
	}
	for(int i=2;i<num;i++) {
		if(num%i==0) {
			return false;
		}
	}
	return true;
}
public static boolean HarshadNumber(int a) {
	int sum=0;
	int temp=a;
	while(a>0) {
		int n=a%10;
		sum+=n;
		a/=10;
	}
	return temp%sum==0;
	
}
public static boolean UglyNumber(int a) {
	if(a<=0)return false;
		
		while(a%2==0)a/=2;
		while(a%3==0)a/=3;
		while(a%5==0)a/=5;
	
	return a==1;
}
public static boolean SmithNumber(int a) {
	int sum=0;
	int sum1=0;
	int temp=a;
	while(a>0) {
		int n=a%10;
		sum+=n;
		a/=10;
	}
	for(int i=1;i<temp;i++) {
		if(temp%i==0&&isPrime(i)) {
				int k=temp;
				while(k%i==0) {
					sum1+=SumOfTheDigits(i);
					k/=i;
				}
		}
	}
	return sum==sum1;
}
public static boolean HappyNumber(int a) {
	int slow=a;
	int fast=a;
	do {
		slow=SquareAndSum(slow);
		fast=SquareAndSum(SquareAndSum(fast));
		if(fast==1) {
			return true;
		}
	}while(fast!=slow);
	return false;
}
public static boolean MagicNumber(int a) {
	int sum=0;
	while(CountNum(a)!=1) {
		sum=SumOfTheDigits(a);
		a=sum;
	}
	return a==1;
}
public static boolean DuckNumber(String a) {
	if(a.charAt(0)=='0')return false;
	int n=a.length();
	for(int i=0;i<n;i++) {
		if(a.charAt(i)=='0')
			return true;
	}
	return false;
}
public static boolean LychrelNumber(int a) {
	for(int i=0;i<50;i++) {
		int b=ReverseOfTheDigits(a);
		int sum=a+b;
		if(sum==ReverseOfTheDigits(sum)) {
			return false;
		}
		a=sum;
	}
	return true;
}
public static boolean LucasNumber(int a) {
	int c=2,b=1;
	while(true) {
		int sum=c+b;
		if(sum==a)return true;
		if(sum>a)return false;
		c=b;
		b=sum;
	}
}
public static void PatternSquareStar(int a) {
	for(int i=0;i<a;i++) {
		for(int j=0;j<a;j++) {
			System.out.print("  *  ");
		}
		System.out.println("\n");
	}
}
public static void PatternSquareNumbersRows(int a) {
	for(int i=1;i<a+1;i++) {
		for(int j=1;j<a+1;j++) {
			System.out.print("  "+j+"  ");
		}
		System.out.println("\n");
	}
}
public static void PatternSquareSquareOutline(int n) {
	for(int i=1;i<n+1;i++) {
		for(int j=1;j<n+1;j++) {
			if(j==1||i==1||j==n||i==n)
			System.out.print("  *  ");
			else
				System.out.print("     ");
		}
		System.out.println("\n");
	}
}
public static void PatternSquareNumberTriangular(int n) {
	for(int i=1;i<n+1;i++) {
		for(int j=1;j<=n-i;j++) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			System.out.print(i+" ");
		}
			System.out.println();
		
	}
}
public static void PatternSquareNumberIncreasingPyramid(int n) {
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(j+" ");
		}
			System.out.println();
		
	}
}
public static void PatternSquareNumberIncreasingReversePyramid(int n) {
	int m=n;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=m;j++) {
			System.out.print(j+" ");
		}
		m--;
			System.out.println();
		
	}
}
public static void PatternSquareNumberChangingPyramid(int n) {
	int m=n;
	for(int i=1;i<=n;i++) {
		for(int j=m;j<=1;j--) {
			System.out.print(j+" ");
		}
		m--;
			System.out.println();
		
	}
}
public static boolean TechNumberChecker(int a) {
	int temp = a;
	int num=a;
	int digitCount=0;
	int secondHalf=0;
	int secondHalfReverse=0;
	while(num>0) {
		digitCount++;
		num/=10;
	}
	int half=0;
	if(digitCount%2==0) {
		half=digitCount/2;
	}
	else {
		return false;
	}
	for(int i=0;i<half;i++) {
		int n=a%10;
		secondHalf=secondHalf*10+n;
		a/=10;
	}
	while(secondHalf>0) {
		int n=secondHalf%10;
		secondHalfReverse=secondHalfReverse*10+n;
		secondHalf/=10;
	}
	int sumOfNumbers=a+secondHalfReverse;
	int squareOfTheSum=sumOfNumbers*sumOfNumbers;
	return squareOfTheSum==temp;
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
public static int primeFactor(int num)
	{
	int n=num;
		int count=0;
		for(int i=2;i<=n;i++) {
			while(num%i==0&&isPrime(i)) {
				count++;
				num/=i;
			}
		}
		return count;
}
public static int NumberOfPrimeFactors(int a) {
	int count=0;
	for(int i=2;i<=a;i++) {
		if(a%i==0&&isPrime(i)) {
			int k=a;
			while(k%i==0) {
				count++;
				k/=i;
			}
		}
	}
	return count;
}

}
