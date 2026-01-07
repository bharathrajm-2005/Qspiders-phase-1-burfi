package example;
import java.util.Arrays;

//import array.*;
public class searching {
public static void main(String[] args) {
	int[] a = {1,2,3,4,5,6,7,8,9,9,9,10,21,23};
//	int k=8;
	FirstAndLastOccurence(a,9);
	
}
public static int LinearSearch(int[]a,int k) {
	for(int i=0;i<a.length;i++) {
		if(a[i]==k) {
			return i;
		}
	}
	return -1;
}
public static int BinarySearch(int[]a,int k) {
	Arrays.sort(a);
	int n=a.length;
	int low=0;
	int high=n-1;
	while(low<=high) {
		int mid=(low+high)/2;
		if(a[mid]==k) {
			System.out.println(a[mid]);
			return mid;
		}
		else if(a[mid]<k) {
			low=mid+1;
		}else {
			high=mid-1;
		}
	}
	return 0;
}
public static void FirstAndLastOccurence(int[]a,int k) {
	int low=0;
	int n=a.length;
	int high=n-1;
	int first=0;
	int last=0;
	while(low<=high) {
		int mid=(low+high)/2;
		if(a[mid]==k) {
			first=mid;
			high=mid-1;
		}
		else if(a[mid]<k) {
			low=mid+1;
		}
		else {
			high=mid-1;
		}
	}
	System.out.println(first);
	low=0;
	high=n-1;
	while(low<=high) {
		int mid=(low+high)/2;
		if(a[mid]==k) {
			last=mid;
			low=mid+1;
		}
		else if(a[mid]<k) {
			low=mid+1;
		}
		else {
			high=mid-1;
		}
	}
	System.out.println(last);
}
}
