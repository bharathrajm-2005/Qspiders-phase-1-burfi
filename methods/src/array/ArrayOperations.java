package array;
import java.util.Arrays;
public class ArrayOperations {
public static void TraversingAnArray(int[]a) {
	int n=a.length;
	for(int i=0;i<n;i++) {
		System.out.print(a[i]+" ");
	}
}
public static int SumOfAllElementsOfAnArray(int[]a) {
	int n=a.length;
	int sum=0;
	for(int i=0;i<n;i++) {
		sum+=a[i];
	}
	return sum;
}
public static int ProductOfAllElementsOfAnArray(int[]a) {
	int n=a.length;
	int product=1;
	for(int i=0;i<n;i++) {
		product*=a[i];
	}
	return product;
}
public static int SumOfAllEvenNumbersOfAnArray(int[]a) {
	int n=a.length;
	int sum=0;
	for(int i=0;i<n;i++) {
		if(a[i]%2==0)
		sum+=a[i];
	}
	return sum;
}
public static int SumOfAllOddNumbersOfAnArray(int[]a) {
	int n=a.length;
	int sum=0;
	for(int i=0;i<n;i++) {
		if(a[i]%2!=0)
		sum+=a[i];
	}
	return sum;
}
public static int SumOfAllEvenIndexNumbersOfAnArray(int[]a) {
	int n=a.length;
	int sum=0;
	for(int i=0;i<n;i++) {
		if(i%2==0)
		sum+=a[i];
	}
	return sum;
}
public static int SumOfAllOddIndexNumbersOfAnArray(int[]a) {
	int n=a.length;
	int sum=0;
	for(int i=0;i<n;i++) {
		if(i%2!=0)
		sum+=a[i];
	}
	return sum;
}
public static int MaximumNumberOfAnArray(int[]a) {
	int n=a.length;
	int max=a[0];
	for(int i=0;i<n;i++) {
		if(a[i]>max)
			max=a[i];
	}
	return max;
}
public static int MinimumNumberOfAnArray(int[]a) {
	int n=a.length;
	int min=a[0];
	for(int i=0;i<n;i++) {
		if(a[i]<min)
			min=a[i];
	}
	return min;
}
public static int MaximumEvenNumberOfAnArray(int[]a) {
	int n=a.length;
	int max=-1;
	for(int i=0;i<n;i++) {
		if(a[i]%2==0) {
			max=a[i];
			break;
		}
	}
	for(int i=0;i<n;i++) {
		if(a[i]%2==0) {
		if(a[i]>max)max=a[i];
		}
	}
	return max;
}
public static int MaximumOddNumberOfAnArray(int[]a) {
	int n=a.length;
	int max=-1;
	for(int i=0;i<n;i++) {
		if(a[i]%2!=0) {
			max=a[i];
			break;
		}
	}
	for(int i=0;i<n;i++) {
		if(a[i]%2!=0) {
		if(a[i]>max)max=a[i];
		}
	}
	return max;
}
public static int MinimumEvenNumberOfAnArray(int[]a) {
	int n=a.length;
	int min=-1;
	for(int i=0;i<n;i++) {
		if(a[i]%2==0) {
			min=a[i];
			break;
		}
	}
	for(int i=0;i<n;i++) {
		if(a[i]%2==0) {
		if(a[i]<min)min=a[i];
		}
	}
	return min;
}
public static int MinimumOddNumberOfAnArray(int[]a) {
	int n=a.length;
	int min=Integer.MAX_VALUE;
	for(int i=0;i<n;i++) {
		if(a[i]%2!=0) {
			min=Math.min(min, a[i]);
		}
	}
	return min;
}
public static int MaximumFromFirstHalfOfAnArray(int[]a) {
	int n=a.length;
	int half=0;
	if(n%2==0)half=n/2;
	else half=(n+1)/2;
	int max=a[0];
	for(int i=0;i<half;i++) {
		if(a[i]>max)max=a[i];
	}
	return max;
}
public static int MaximumFromSecondHalfOfAnArray(int[]a) {
	int n=a.length;
	int half=0;
	if(n%2==0)half=n/2;
	else half=(n+1)/2;
	int max=a[half];
	for(int i=half;i<n;i++) {
		if(a[i]>max)max=a[i];
	}
	return max;
}
public static int[] RotateAnArrayKTimes(int []a,int k) {
	int n = a.length;
	k=k%n;
	Reverse(a, 0, k-1);
	Reverse(a, k, n-1);
	Reverse(a, 0, n-1);
	
	return a;
}
public static void Reverse(int[]a,int i,int j) {
	while(i<j) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		i++;
		j--;
	}
}
public static int[] EvenNumbersOfAnArray(int[]a) {
	int n=a.length;
	int count=0;
	for(int i=0;i<n;i++) {
		if(a[i]%2==0) {
			count++;
		}
	}
	int[]even=new int[count];
	int j=0;
	for(int i=0;i<n;i++) {
		if(a[i]%2==0) {
			even[j]=a[i];
			j++;
		}
	}
	return even;
}
public static int[] OddNumbersOfAnArray(int[]a) {
	int n=a.length;
	int count=0;
	for(int i=0;i<n;i++) {
		if(a[i]%2!=0) {
			count++;
		}
	}
	int[]Odd=new int[count];
	int j=0;
	for(int i=0;i<n;i++) {
		if(a[i]%2!=0) {
			Odd[j]=a[i];
			j++;
		}
	}
	return Odd;
}
public static int[] ReverseAnArrayUsingTwoPointers(int[]a) {
	int n=a.length;
	int i=0;
	int j=n-1;
	while(i<j) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		i++;
		j--;
	}
	return a;
}
public static int[] RemoveDuplicate(int[]a) {
	int n= CountUniqueElements(a);
	int[]ans=new int[n];
	int k=0;
	for(int i=0;i<a.length;i++) {
		if(!Contains(a, i, a[i])) {
			ans[k++]=a[i];
		}
	}
	return ans;
}
public static int CountUniqueElements(int []a) {
	int count=0;
	for(int i=0;i<a.length;i++) {
		if(!Contains(a, i, a[i])) {
			count++;
		}
	}
	return count;
}
public static boolean Contains(int[]a,int index,int target) {
	for(int i=0;i<index;i++) {
		if(a[i]==target) {
			return true;
		}
	}
	return false;
}
public static int[] RightShiftAnArray(int[]a) {
	int n=a.length;
	int le=a[n-1];
	for(int i=0;i<n-1;i++) {
		a[i+1]=a[i];
	}
	a[0]=le;
	return a;
	
}
public static int[] LeftShiftAnArray(int[]a) {
	int n=a.length;
	int[]arr=new int[n];
	arr[n-1]=a[0];
	for(int i=n-2;i>=0;i--) {
		arr[i]=a[i+1];
	}
	return arr;
}
public static int[] RotateAnArrayMultipleTimes(int[]a,int k) {
	int n=a.length;
	int[]arr=new int[n];
	k=k%n;
	for(int j=0;j<k;j++) {
		arr[0]=a[n-1];
		for(int i=1;i<n;i++) {
			arr[i]=a[i-1];
		}
		a=arr.clone();
	}
	return arr;
}
public static int[] MoveElement(int[]a,int target) {
	int n=a.length;
	int[]b=new int[n];
	int index=0;
	for(int i=0;i<n;i++) {
		if(a[i]==target) {
			index=i;
			break;
		}
	}
	b[n-1]=a[index];
	int j=0;
	for(int i=0;i<n;i++) {
		if(i==index) {
			continue;
		}
		else {
			b[j]=a[i];
			j++;
		}
	}
	return b;
}
public static int[] MoveAllElement(int[]a,int target) {
	int n=a.length;
	int[]b=new int[n];
	int j=0;
	for(int i=0;i<n;i++) {
		if(a[i]==target)
			continue;
		else {
			b[j]=a[i];
			j++;
		}
	}
	for(int i=j;i<n;i++) {
		b[i]=target;
	}
	return b;
}
public static boolean ContainsElement(int[]a,int index,int target) {
	for(int i=0;i<index;i++) {
		if(a[i]==target) {
			return true;
		}
	}return false;
}
public static int[] UniqueElements(int[]a) {
	int n=a.length;
	int numberOfUniqueElements=0;
	for(int i=0;i<n;i++) {
		if(CountNumber(a, a[i])==1) {
			numberOfUniqueElements++;
		}
	}
	int[]uniqueArray=new int[numberOfUniqueElements];
	int k=0;
	for(int i=0;i<n;i++) {
		if(CountNumber(a, a[i])==1) {
			uniqueArray[k]=a[i];
			k++;
		}
	}
	return uniqueArray;
}
public static int CountNumber(int[]a,int b) {
	int n=a.length;
	int c=0;
	for(int i=0;i<n;i++) {
		if(a[i]==b) {
			c++;
		}
	}
	return c;
}
public static int[] TwoSum(int[]a,int b) {
	int []ans=new int[2];
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a.length;j++) {
			if(a[i]+a[j]==b) {
				if(a[i]<a[j]) {
					ans[0]=a[i];
					ans[1]=a[j];
					break;
				}
				else {
					ans[0]=a[j];
					ans[1]=a[i];
					break;
				}
			}
		}
	}
	return ans;
}
public static boolean TwoSumVerify(int[]a,int b) {
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a.length;j++) {
			if(a[i]+a[j]==b) {
				return true;
				}
			}
	}
	return false;
}
public static boolean TwoSum1(int[]a,int b) {
	int n=a.length;
	int i=0;
	int j=n-1;
	while(i<j) {
		int k = a[i]+a[j];
		if(k>b) {
			j--;
		}
		else if(k==b) {
			return true;
		}
		else {
			i++;
		}
	}return false;
}
public static int[] EvenOddSorted(int[]a) {
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
		}else
			i++;
	}
	return a;
}
public static int[] ReverseAnArray(int[]a,int i,int j) {
	while(i<j) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		i++;
		j--;
	}
	return a;
}
public static int[] MergeTwoArray(int []a,int[]b) {
	int n1=a.length;
	int n2=b.length;
	int n=n1+n2;
	int[]arr=new int[n];
	for(int i=0;i<n1;i++) {
		arr[i]=a[i];
	}
	for(int i=0;i<n2;i++) {
		arr[i+n1]=b[i];
	}
	Arrays.sort(arr);
	return arr;
}
public static int PairOfSumLessThanK(int[]a,int k) {
	Arrays.sort(a);
	int n=a.length;
	int count=0;
	int i=0;
	int j=n-1;
	while(i<j) {
		if(a[i]+a[j]<k) {
			count+=(j-i);
			System.out.println(a[i]+","+a[j]);
			i++;
		}
		else {
			j--;
		}
	}
	return count;
}
public static int[] MergeSorted(int[]a,int[]b){
	int n1=a.length;
	int n2=b.length;
	int n=n1+n2;
	int[]merged=new int[n];
	int i=0;
	int j=0;
	int l=0;
	while(i<n1&&j<n2) {
		if(a[i]<=b[j]) {
			merged[l]=a[i];
			l++;
			i++;
		}
		else {
			merged[l]=b[j];
			l++;
			j++;
		}
	}
	while(i<n1) {
		merged[l]=a[i];
		l++;
		i++;
	}
	while(j<n2) {
		merged[l]=b[j];
		l++;
		j++;
	}
	return merged;
}
public static int[] SubArraysSum(int[]a,int k) {
	int n=a.length;
	int i=0;
	int count=n-k+1;
	int[]arr=new int[count];
	int b=0;
	int sum=0;
	for(int j=0;j<n;j++) {
		sum+=a[j];
		if((j-i+1)==k) {
			arr[b++]=sum;
			sum-=a[i];
			i++;
		}
	}
	return arr;
}
public static int SubArraysMaximumSum(int[]a,int k) {
	int n=a.length;
	int i=0;
	int sum=0;
	int max=0;
	for(int j=0;j<n;j++) {
		sum+=a[j];
		if((j-i+1)==k) {
			max=Math.max(max, sum);
			sum-=a[i];
			i++;
		}
	}
	return max;
}
public static int NumberOfAverageSubArray(int[]a,int k,int x) {
	int n=a.length;
	int i=0;
	int sum=0;
	int count=0;
	for(int j=0;j<n;j++) {
		sum+=a[j];
		if(j-i+1==k) {
			double avg=sum/k;
			if(avg>=x) {
				count++;
			}
			sum-=a[i];
			i++;
		}
	}
	return count;
}
public static int SubArraysMinimumSum(int[]a,int k) {
	int n=a.length;
	int i=0;
	int sum=0;
	int min=Integer.MAX_VALUE;
	for(int j=0;j<n;j++) {
		sum+=a[j];
		if(j-i+1==k) {
			min=Math.min(min, sum);
			sum-=a[i];
			i++;
		}
	}
	return min;
}
public static int MaxNumberOfEvenElements(int[]a,int k) {
	int n=a.length;
	int i=0;
	int count=0;
	int evenCount=0;
	for(int j=0;j<n;j++) {
		if(a[j]%2==0) {
			evenCount++;
		}
		if(j-i+1==k) {
			count=Math.max(count, evenCount);
			if(a[i]%2==0) {
				evenCount--;
			}
			i++;
		}
	}return count;
}
public static int SubArraysMaximumSumCheck(int[]a,int k) {
	int n=a.length;
	int i=0;
	int sum=0;
	int min=Integer.MAX_VALUE;
	for(int j=0;j<n;j++) {
		sum+=a[j];
		if(j-i+1==k) {
			min=Math.min(min, sum);
			sum-=a[i];
			i++;
		}
	}
	return min;
}
public static int MaxDiferenceBetweenWindows(int[]a,int k) {
	int n=a.length;
	int i=0;
	int sum=0;
	int sum1=0;
	int max=0;
	for(int j=0;j<n;j++) {
		sum+=a[j];
		if(j-i+1==k) {
			if(i==0) {
				sum1=sum;
			}
			else {
				int num =sum1-sum;
				max=Math.max(max, Math.abs(num));
				sum1=sum;
			}
			sum-=a[i];
			i++;
		}
	}
	return max;
}
public static int NumberOfDigits(int a) {
	int count=0;
	while(a>0) {
		count++;
		a/=10;
	}
	return count;
}
public static int SumOfArrayNumbers(int[]a) {
	int n=a.length;
	int sum=0;
	for(int i=0;i<n;i++) {
		sum+=a[i];
	}
	return sum;
}
public static int SumOfDigits(int a) {
	int sum=0;
	while(a>0) {
		int n=a%10;
		sum+=n;
		a/=10;
	}
	return sum;
}
public static int[] LeftShift(int[]a,int b) {
	int n=a.length;
	for(int i=0;i<n-1;i++) {
		a[i]=a[i+1];
	}
	a[n-1]=b;
	return a;
}
public static boolean KiethNumber(int a) {
	int n=NumberOfDigits(a);
	int temp=a;
	int[]arr=new int[n];
	int i=0;
	int b=0;
	while(a>0) {
		int k=a%10;
		b=b*10+k;
		a/=10;
	}
	while(b>0) {
		arr[i]=b%10;
		b/=10;
		i++;
	}
	while(SumOfArrayNumbers(arr)<temp) {
		int num=SumOfArrayNumbers(arr);
		arr=LeftShift(arr, num);
		
	}
	return SumOfArrayNumbers(arr)==temp;
}
public static int[] FirstPositiveNumber(int[]a,int k) {
	int n=a.length;
	int i=0;
	int arr[]=new int[n-k+1];
	int m=0;
	for(int j=0;j<n;j++) {
		if(j-i+1==k) {
			int b=i;
			while(b<=j) {
				if(a[b]>0) {
					arr[m++]=a[b];
					break;
				}
				else {
					b++;
				}
			}
			i++;
		}
	}
	return arr;
}
public static int[] FirstNegativeNumber(int[]a,int k) {
	int n=a.length;
	int i=0;
	int arr[]=new int[n-k+1];
	int m=0;
	for(int j=0;j<n;j++) {
		if(j-i+1==k) {
			int b=i;
			while(b<=j) {
				if(b==j&&a[b]>=0) {
					arr[m++]=0;
					break;
				}
				if(a[b]<0) {
					arr[m++]=a[b];
					break;
				}
				else {
					b++;
				}
			}
			i++;
		}
	}
	return arr;
}
public static int MinSubArray(int[]a,int s) {
	int n=a.length;
	int i=0;
	int min=n;
	int sum=0;
	for(int j=0;j<n;j++) {
		sum+=a[j];
		if(sum>=s) {
			min=Math.min(min,j-i+1);
			sum-=a[i];
			i++;
		}
	}
	return min;
}
public static int MaxSubArray(int[]a,int s) {
	int n=a.length;
	int i=0;
	int max=0;
	int sum=0;
	for(int j=0;j<n;j++) {
		sum+=a[j];
		while(sum>s){
			sum-=a[i];
			i++;
		}
		max=Math.max(max,j-i+1);
	}
	return max;
}
public static int MaxSubArrayWithKOddNumbers(int[]a,int k) {
	int n=a.length;
	int i=0;
	int count=0;
	int max=0;
	for(int j=0;j<n;j++) {
		if(a[j]%2!=0){
			count++;
		}
		while(count>k) {
			if(a[i]%2!=0) {
				count--;
			}
			i++;
		}
		max=Math.max(max, j-i+1);
	}
	return max;
}
}