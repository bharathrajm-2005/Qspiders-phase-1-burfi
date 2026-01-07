package example;
//

public class Bitwise {
public static void main(String[] args) {
	int[]a= {1,4,2,3,5,7,75,4,32,3,4};
	int large=a[0];
//	int sec_large=Integer.MIN_VALUE;
	for(int i=1;i<a.length-1;i++) {
		if(a[i]>large) {
//			sec_large=large;
			large=a[i];
//			System.out.println(large);
//			System.out.println(sec_large);
		}
	}
	
}
}
