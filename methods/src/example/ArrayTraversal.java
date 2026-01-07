package example;
import array.ArrayOperations;
import java.util.*;
public class ArrayTraversal {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int[]a= {1,2,3,4,5,6,7,8,9,10};
	int[]b=ArrayOperations.OddNumbersOfAnArray(a);
	ArrayOperations.TraversingAnArray(b);
	sc.close();
}
}
