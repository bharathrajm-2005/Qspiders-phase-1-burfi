package example;

import java.util.Arrays;

public class ContainsDuplicate {
public static void main(String[] args) {
	int[]a= {10,20,30,10,10,15,12};
	int cnt=count(a);
	int[]ans=new int[cnt];
	int k=0;
	for(int i=0;i<a.length;i++) {
		if(!Contains(a, i, a[i])) {
			ans[k]=a[i];
			k++;
		}
	}
	System.out.println(Arrays.toString(ans));
}
public static int count(int []a) {
	int count=0;
	for(int i=0;i<a.length;i++) {
		if(!Contains(a, i, a[i])) {
			count++;
		}
	}
	return count;
}
public static boolean Contains(int[]a,int index,int element) {
	for(int i=0;i<index;i++) {
		if(a[i]==element)return true;
		
	}
	return false;
}
}
