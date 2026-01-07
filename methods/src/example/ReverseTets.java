package example;
//import array.TwoDimensionalArray;
import java.util.*;
public class ReverseTets {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][]jag=new int[3][];
		System.out.println("Enter the size of the arrays");
		for(int i=0;i<jag.length;i++) {
			jag[i]=new int [sc.nextInt()];
		}
		for(int i=0;i<jag.length;i++) {
			System.out.println("Enter the elements of "+i+" Array");
			for(int j=0;j<jag[i].length;j++) {
				jag[i][j]=sc.nextInt();
			}
		}
		ArrayTraversal(jag);
		ElementsInRow(jag);
		ElementsInColumn(jag);
		sc.close();
}
	public static void ArrayTraversal(int[][]a) {
		int n=a.length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void ElementsInRow(int[][]a) {
		int n=a.length;
		for(int i=0;i<n;i++) {
			System.out.println("This is the "+i+" Row");
			for(int j=0;j<a[i].length;j++) {
				System.out.println(a[i][j]);
			}
		}
	}
	public static void ElementsInColumn(int[][]a) {
		int n=a.length;
		int col=0;
		for(int i=0;i<n;i++) {
			col=Math.max(col, a[i].length);
		}
		for(int j=0;j<col;j++) {
			System.out.println("This is the "+j+" column");
			for(int i=0;i<n;i++) {
				if(j<a[i].length)
				System.out.println(a[i][j]);
			}
		}
	}
}