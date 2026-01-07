package decision_making;

public class IfElse {
	public static void main(String[] args) {
		
	}
	/**
	 * This method will return the greatest of two numbers.
	 */
	public static int maximumOfTwo(int a , int b) {
		if(a>b) {
			return a;
		}
		else {
			return b;
		}
	}
	/**
	 * This method will determine weather the number is even or odd.
	 */
	public static boolean evenOrOdd(int a) {
		if(a%2==0) {
			return true;
		}
		else {
			return false;
		}
	}
	/**
	 * Determines whether the character is a vowel or consonant.
	 *
	 * @param c character to test
	 * @return "Vowel" or "Consonant"
	 */
	public static String vowelOrConsonent(char c) {
		c=Character.toLowerCase(c);
		
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
			return "Vowel";
		}
		else {
			return "Consonent";
		}
	}
	/**
	 * This method will return weather the character is Upper case or Lower case.
	 * @param c character to test
	 * @return "Upper case" or "Lower case"
	 */
	public static String uppercaseOrLowercase(char c) {
		int a = (int)c;
		if(97<=a&&a<=122) {
			return "Lower case";
		}
		else {
			return "Upper case";
		}
	}
	/**
	 * This method will return weather the given year is a Leap year or not.
	 * @param a Integer to test
	 * @return "Leap year" or "Not a Leap Year"
	 */
	public static String leapYear(int a) {
		if(a<0) {
			return "Year Cant be negative";
		}
		if((a%4==0&&a%100!=0)||(a%400==0)) {
			return "Leap Year";
		}
		else {
			return "Not a Leap Year";
		}
	}
	
	
}
