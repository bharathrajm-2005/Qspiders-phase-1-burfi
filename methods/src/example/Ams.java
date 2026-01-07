package example;
//import java.util.Arrays;
//import java.util.Scanner;
import array.ArrayOperations;
//import looping_statements.*;
public class Ams {
public static void main(String[] args) {
	int []a= {1,2,3,4,5,6,7,8,9,10};
	int k=2;
	ArrayOperations.TraversingAnArray(Ktimes(a,k));
//	sc.close();
}
public static int[] Ktimes(int []a,int k) {
	int n=a.length;
	reverse(a, 0, n-1);
	reverse(a, 0, k-1);
	reverse(a, k, n-1);
	return a;
}
public static int[] reverse(int[]a,int i,int j) {
	while(i<j) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		i++;
		j--;
	}
	return a;
}
}
