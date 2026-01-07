package classesAndObjects;
import java.util.*;
public class Car {
	String brand;
	String model;
	int year;
	double price;
	Car(String brand){
		this.brand=brand;
	}
	Car(String brand,String model){
		this.brand=brand;
		this.model=model;
	}
	Car(String brand,String model,int year){
		this.brand=brand;
		this.model=model;
		this.year=year;
	}
	Car(String brand,String model,int year,double price){
		this.brand=brand;
		this.model=model;
		this.price=price;
		this.year=year;
	}
	public void display() {
		System.out.println("Brand : "+brand);
		System.out.println("Model : "+model);
		System.out.println("Year : "+year);
		System.out.println("Price : "+price);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Brand Name : ");
		String brand=sc.nextLine();
		System.out.println();
		System.out.print("Enter the Model Name : ");
		String model=sc.nextLine();
		System.out.println();
		System.out.print("Enter the Year of Manufacture : ");
		int year=sc.nextInt();
		System.out.println();
		System.out.print("Enter the Market price : ");
		int price=sc.nextInt();
		System.out.println();
		Car obj=new Car(brand,model,year,price);
		obj.display();
		sc.close();
	}
	
}
