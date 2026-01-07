package example;
//import java.util.*;
import array.TwoDimensionalArray;
public class Assignmnt9 {
public static void main(String[] args) {
//	int sum=0;
	int sum1=0;
	int[][]arr= {{1,2,3},
				{4,5,6},
				{7,8,9}};
	
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			sum1+=arr[i][j];
		}
		System.out.println(sum1);
		sum1=0;
	}
	int max=Integer.MIN_VALUE;
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			max=Math.max(max, arr[i][j]);
		}
	}
	System.out.println("Max value:"+max);
	int even=0;
	int odd=0;
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			if(arr[i][j]%2==0) {
				even++;
			}
			else {
				odd++;
			}
		}
	}
	System.out.println("Even : "+even+" Odd : "+odd);
	int max_=Integer.MIN_VALUE;
	int index=0;
	for(int i=0;i<3;i++) {
		int sum2=0;
		for(int j=0;j<arr[i].length;j++) {
			sum2+=arr[i][j];
		}
		if(max_<sum2) {
			max_=sum2;
			index=i;
		}
	}
	int[][]arr1= {{0,1,0},{2,3,0},{0,0,2}};
	System.out.println(index);
	for(int i=0;i<3;i++) {
		int count=0;
		for(int j=0;j<3;j++) {
			if(arr1[i][j]==0) {
				count++;
			}
		}
		System.out.println(count);
	}
	int[][]arr2= {{0,0,0},{2,3,0},{0,0,2}};
	boolean found=false;
	for(int i=0;i<3;i++) {
		int count=0;
		for(int j=0;j<3;j++) {
			if(arr2[i][j]==0) {
				count++;
			}
		}
		if(count==3)
			found=true;
	}
	System.out.println(found);
	for(int j=0;j<3;j++) {
		int count=0;
		for(int i=0;i<3;i++) {
			if(arr1[i][j]!=0) {
				count++;
			}
		}
		System.out.print(count+" ");
	}
	int[][]summ=new int[3][3];
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			int n=arr[i][j]+arr1[i][j];
			summ[i][j]=n;
		}
	}
	System.out.println("\n");
	TwoDimensionalArray.TraversalOfAnArray(summ);
	for(int j=0;j<3;j++) {
		int sumCol=0;
		for(int i=0;i<3;i++) {
			sumCol+=arr[i][j];
		}
		System.out.println(sumCol);
	}
	int mini = Integer.MAX_VALUE;
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			mini=Math.min(mini,arr[i][j]);
		}
	}
	System.out.println(mini);
	int MinCol=Integer.MAX_VALUE;
	int ind=0;
	for(int j=0;j<3;j++) {
		int sumCol=0;
		for(int i=0;i<3;i++) {
			sumCol+=arr[i][j];
		} 
		if(MinCol>sumCol) {
			ind=j;
			MinCol=sumCol;
		}
	}System.out.println(ind+" "+MinCol);
}
}