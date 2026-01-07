package example;
import method_overload.Disc;
import java.util.*;
public class PriceCalculator {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	double price= sc.nextDouble();
	 double discountPercent=sc.nextDouble();
	 double gstPercent = sc.nextDouble();
	 Disc obj=new Disc();
	 double a=obj.finalPrice(price, discountPercent, gstPercent);
	 System.out.println("The Discounted Price Is:"+a);
	 sc.close();
	 }
}
