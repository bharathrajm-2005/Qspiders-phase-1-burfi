package array;

import java.util.Arrays;
public class SearchingOperations {
public static int LinearSearch(int[]a,int k) {
	for(int i=0;i<a.length;i++) {
		if(a[i]==k) {
			return i;
		}
	}
	return -1;
}
public static int BinarySearch(int[]a,int k) {
	int n=a.length;
	Arrays.sort(a);
	int low=0;
	int high=n-1;
	while(low<=high) {
		int mid=(low+high)/2;
		if(a[mid]==k)
			return mid;
		else if(a[mid]<k) 
			low = mid+1;
		else
			high = mid-1;
	}
	return -1;
}
public static void FirstAndLastOccurence(int[]a,int k) {
	int n=a.length;
	int low=0;
	int high=n-1;
	int first=0;
	int last=0;
	while(low<=high) {
		int mid=(low+high)/2;
		if(a[mid]==k) {
			first=mid;
			high=mid-1;
		}
		else if(a[mid]>k) {
			high=mid-1;
		}
		else
			low=mid+1;
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
		else if(a[mid]>k) {
			high=mid-1;
		}
		else
			low=mid+1;
	}
	System.out.println(last);
}
}