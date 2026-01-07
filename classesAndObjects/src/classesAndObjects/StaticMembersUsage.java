package classesAndObjects;
import java.util.*;
public class StaticMembersUsage {
	int java;
	int web;
	int sql;
	int id;
	String name;
	int totalMarks=80;
	static int count;
	{
		count++;
	}
StaticMembersUsage(int java,int web,int sql,int id,String name) {
this.id=id;
this.name=name;
this.web=web;
this.sql=sql;
this.java=java;
}
public int percentage() {
	int javaPercent = java*100/totalMarks;
	int webPercent = web*100/totalMarks;
	int sqlPercent = sql*100/totalMarks;
//	System.out.println(javaPercent+"  "+webPercent+"  "+sqlPercent);
	int averagePercentage=(javaPercent+webPercent+sqlPercent)/3;
	return averagePercentage;
}
public static void timings() {
	System.out.println("Lunch : 11.10 am - 12.00 pm");
}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
//	System.out.print("Enter the ID : ");
//	int id = sc.nextInt();
//	System.out.print("Enter the name : ");
//	sc.nextLine();
//	String name = sc.nextLine();
//	System.out.print("Enter the Java marks : ");
//	int java = sc.nextInt();
////	System.out.println();
//	System.out.print("Enter the web marks : ");
//	int web = sc.nextInt();
////	System.out.println();
//	System.out.print("Enter the sql marks : ");
//	int sql = sc.nextInt();
////	System.out.println();
	StaticMembersUsage obj= new StaticMembersUsage(50, 40, 70, 101, "Bharath Raj M");
	StaticMembersUsage obj1= new StaticMembersUsage(50, 40, 70, 101, "Bharath Raj M");
	StaticMembersUsage obj2= new StaticMembersUsage(50, 40, 70, 101, "Bharath Raj M");
	StaticMembersUsage obj3= new StaticMembersUsage(50, 40, 70, 101, "Bharath Raj M");
	
	System.out.print("Average Percentage is : "+obj.percentage());
	System.out.print("Average Percentage is : "+obj1.percentage());
	System.out.print("Average Percentage is : "+obj2.percentage());
	System.out.print("Average Percentage is : "+obj3.percentage());
	sc.close();
	System.out.println();
	System.out.println("The number of objects is : "+count);
	
}

}
