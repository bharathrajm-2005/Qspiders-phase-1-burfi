package example;
public class JaggedArray {
public static void main(String[] args) {
	int[][]jag= {{1,2},{3,4,5},{1},{5,6,7,8},{10}};
	int n=jag.length;
	for(int i=0;i<n;i++) {
		for(int j=0;j<jag[i].length;j++) {
			System.out.print(jag[i][j]+"");
		}
		System.out.println();
	}
}
}