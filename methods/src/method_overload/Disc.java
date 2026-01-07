package method_overload;

public class Disc {
public double  finalPrice(double price, double discountPercent, double gstPercent) {
	double disc_price=price-(price/discountPercent);
	double f_price=disc_price+(disc_price/gstPercent);
	return f_price;
}
public static void main(String[]args) {
	
}
}
