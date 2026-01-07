package classesAndObjects;

public class ConstructorsExample {
public static void main(String[] args) {
	hotel o1 = new hotel(100,"Masala dosa",4.3);
	hotel o2 = new hotel(40,"Kal dosa",4.9);
	hotel o3 = new hotel(40,"Plain dosa",5.0);
	hotel o4 = new hotel(135,"Chicken Fried Rice",5.0);
	hotel o5 = new hotel(120,"Oreo Dessert");
	o1.Display();
	o2.Display();
	o3.Display();
	o4.Display();
	o5.Display();
	o1.m1();
}
}
class hotel{
	int price;
	String foodName;
	double rating;
	hotel(int price,String foodName,double rating){
		this.price = price;
		this.foodName=foodName;
		this.rating=rating;
	}
	//Constructor overloading
	hotel(int price,String foodName){
		this.price = price;
		this.foodName=foodName;
	}
	hotel(String foodName,double rating){
		this.foodName=foodName;
		this.rating=rating;
	}
	
	public void Display() {
		System.out.println("Food name : "+foodName);
		System.out.println("Price : "+price);
		System.out.println("Rating (out of 5):"+rating);
	}
	public void  m1() {
		System.out.println(this);
	}
}
