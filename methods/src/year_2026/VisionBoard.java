package year_2026;
import java.util.*;
public class VisionBoard {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String stats=sc.next();
	boolean result=Status(stats);
	while(result==false) {
		Status(stats);
	}
	System.out.println("Done Successfully!!");
	sc.close();
}
public static boolean Status (String stats) {
	if(stats=="Done") {
		return true;
	}
	else {
		return false;
	}
}
}
