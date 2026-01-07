package example;

import java.util.Arrays;

public class RemoveOddElements {
public static void main(String[] args) {
	int[]a= {10,20,30,10,10,15,12};
	int c=count(a);
	int[]b=new int[c];
	int k=0;
	for(int i=0;i<a.length;i++) {
		if(i%2==0) {
			b[k]=a[i];
			k++;
		}
	}
	System.out.println(Arrays.toString(b));
	
}
public static int count(int[]a) {
	int countt=0;
	for(int i=0;i<a.length;i++) {
		if(i%2==0) {
			countt++;
		}
	}
	return countt;
}
}
