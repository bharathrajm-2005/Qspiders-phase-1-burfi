package example;

import java.util.Arrays;

public class reverseofarrayhalf {
public static void main(String[] args) {
	int[]a= {1,2,3,4,5,6};
	System.out.println(Arrays.toString(Reverse(a)));
}
public static int[] Reverse(int[]a) {
	int b=a.length;
	int i=0;
	
	int k=b/2;
	int j=k-1;
	int[]arr=new int[k];
	for(int l=0;l<k;l++) {
		arr[l]=a[l];
		
	}
	while(i<j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		i++;
		j--;
	}return arr;
}
}
