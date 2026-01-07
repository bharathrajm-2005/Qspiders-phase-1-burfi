package array;

public class SortingOperations {
/*
 * This method will perform Insertion sort.
 * The main logic is Check and Shift.
 */
public static int[] InsertionSort(int[]a) {
	int n=a.length;
	for(int i=1;i<n;i++) {
		int j=i-1;
		int temp=a[i];
		while(j>=0&&a[j]>temp) {
			a[j+1]=a[j];
			j--;
		}
		a[j+1]=temp;
	}
	return a;
}
public static int[] SelectionSort(int[]a) {
	int n=a.length;
	for(int i=0;i<n-1;i++) {
		int minIndex=i;
		for(int j=i+1;j<n;j++) {
			if(a[j]<a[minIndex]) {
				minIndex=j;
			}
		}
		int temp=a[i];
		a[i]=a[minIndex];
		a[minIndex]=temp;
	}
	return a;
}
public static int[] BubbleSort(int []a) {
	int n=a.length;
	int count=0;
	for(int i=0;i<n-1;i++) {
		count=0;
		for(int j=0;j<n-i-1;j++) {
			if(a[j+1]<a[j]) {
				int temp=a[j+1];
				a[j+1]=a[j];
				a[j]=temp;
				count++;
			}
		}
		if(count==0) {
			break;
		}
	}
	return a;
}

}