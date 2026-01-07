package array;

public class TwoDimensionalArray {
public static void TraversalOfAnArray(int[][]a) {
	int n=a.length;
	for(int i=0;i<n;i++) {
		for(int j=0;j<a[i].length;j++) {
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
}
public static void TraversalOfAnArray(int[]a) {
	int n=a.length;
	for(int i=0;i<n;i++) {
		System.out.print(a[i]+" ");
	}
}
public static int[] RowWiseSum(int[][]a) {
	int n=a.length;
	int sum=0;
	int k=0;
	int[]arr=new int[n];
	for(int i=0;i<n;i++) {
		for(int j=0;j<a[i].length;j++) {
			sum+=a[i][j];
		}
		arr[k++]=sum;
		sum=0;
	}
	return arr;
}
public static int[] ColumnWiseSum(int[][]a) {
	int n=a.length;
	int sum=0;
	int k=0;
	int col=0;
	for(int i=0;i<n;i++) {
		col=Math.max(col, a[i].length);
	}
	int []ans=new int[col];
	for(int j=0;j<col;j++) {
		for(int i=0;i<n;i++) {
			if (j < a[i].length) {
                sum += a[i][j];
            }
		}
		ans[k++]=sum;
		sum=0;
	}
	return ans;
}
public static int[] ColumnWiseMax(int[][]a) {
	int n=a.length;
	int col=0;
	for(int i=0;i<n;i++) {
		col=Math.max(col, a[i].length);
	}
	int[]ans=new int[col];
	int k=0;
	int max=Integer.MIN_VALUE;
	for(int j=0;j<col;j++) {
		for(int i=0;i<n;i++) {
			if(j<a[i].length) {
				max=Math.max(max, a[i][j]);
			}
		}
		ans[k++]=max;
		max=Integer.MIN_VALUE;
	}
	return ans;
}
}