package example;

import java.util.Arrays;

public class checkk {
	public static void main(String[] args) {
		int[]a= {1,2,3,4,5,6,4};
		System.out.println(Arrays.toString(Reverse(a,4)));
	}
	public static int[] Reverse(int[]a,int b) {
		int n=a.length;
		int []arr= {-1,-1};
		for(int i=0;i<n;i++) {
			if(a[i]==b) {
				arr[0]=i;
				break;
			}
		}
		for(int i=n-1;i>0;i--) {
			if(a[i]==b) {
				arr[1]=i;
				break;
			}
		}
		
		return arr;
	}
}
