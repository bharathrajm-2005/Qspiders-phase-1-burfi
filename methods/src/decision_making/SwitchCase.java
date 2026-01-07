package decision_making;

public class SwitchCase {
	public static String DayOfTheWeek(int a) {
		switch(a) {
		case 1:
		{
			return("Sunday");	
		}
		case 2:
		{
			return("Monday");	
		}
		case 3:
		{
			return("Tuesday");	
		}
		case 4:
		{
			return("Wednesday");
			
		}
		case 5:
		{
			return("Thursday");	
		}
		case 6:
		{
			return("Friday");
		}
		case 7:
		{
			return("Saturday");	
		}
		default:
			return "Invalid";
		}
	}
	public static String EvenOrOdd(int a) {
	int b = a%2;
	switch(b) {
	case 0:
		return("Even");
	
	case 1:
		return("Odd");
	default:
		return "";
			  }
	}
}