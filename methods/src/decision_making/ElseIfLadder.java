package decision_making;

public class ElseIfLadder {

    /**
     * Determines how an integer is divisible with respect to two divisors.
     *
     * @param a the integer to test
     * @param b the first divisor
     * @param c the second divisor
     * @return a message stating whether a is divisible by both, only b, only c, or neither
     */
    public static String divisibilityByTwoNumbers(int a, int b, int c) {
        if (a % b == 0 && a % c == 0) {
            return a + " is divisible by " + b + " and " + c;
        } else if (a % b == 0) {
            return a + " is only divisible by " + b;
        } else if (a % c == 0) {
            return a + " is only divisible by " + c;
        } else {
            return a + " is not divisible by either " + b + " or " + c;
        }
    }
    /**
     * Breaks an amount into Indian currency denominations
     * (500, 200, 100, 50, 20, 10, 5, 2, and 1) using a greedy approach.
     *
     * For each denomination, it prints how many notes/coins are used.
     *
     * @param amount the amount of money to be broken into notes and coins
     * @return a summary line stating the total number of notes and coins used
     */
    public static String currencyNoteDivider(int amount) {

        int notes200 = 0, notes500 = 0, notes100 = 0, notes50 = 0;
        int notes20 = 0, notes10 = 0, coins5 = 0, coins2 = 0, coins1 = 0;
        if (amount >= 500) {
            notes500 = amount / 500;
            amount %= 500;
        }
        if (amount >= 200) {
            notes200 = amount / 200;
            amount %= 200;
        }
        if (amount >= 100) {
            notes100 = amount / 100;
            amount %= 100;
        }
        if (amount >= 50) {
            notes50 = amount / 50;
            amount %= 50;
        }
        if (amount >= 20) {
            notes20 = amount / 20;
            amount %= 20;
        }
        if (amount >= 10) {
            notes10 = amount / 10;
            amount %= 10;
        }
        if (amount >= 5) {
            coins5 = amount / 5;
            amount %= 5;
        }
        if (amount >= 2) {
            coins2 = amount / 2;
            amount %= 2;
        }
        if (amount >= 1) {
            coins1 = amount;
        }

        int totalPieces = notes200 + notes500 + notes100 + notes50
                        + notes20 + notes10 + coins5 + coins2 + coins1;
        System.out.println("Number of 500-rupee notes  : " + notes500);
        System.out.println("Number of 200-rupee notes  : " + notes200);
        System.out.println("Number of 100-rupee notes  : " + notes100);
        System.out.println("Number of 50-rupee notes   : " + notes50);
        System.out.println("Number of 20-rupee notes   : " + notes20);
        System.out.println("Number of 10-rupee notes   : " + notes10);
        System.out.println("Number of 5-rupee coins    : " + coins5);
        System.out.println("Number of 2-rupee coins    : " + coins2);
        System.out.println("Number of 1-rupee coins    : " + coins1);

        return "Total number of notes and coins used: " + totalPieces;
    }
    /**
     * Calculates the salary to be allotted to an employee based on
     * gender, years of service, and qualification.
     * @param gender the gender code, typically 'M'/'m' for male, anything else treated as female
     * @param yearsOfService the completed years of service
     * @param qualification the qualification string, e.g. "PG" or "UG" (case-insensitive)
     * @return the salary amount in currency units; 0 if no rule matches
     */
    public static int salaryAllotment(char c,int yos,String q) {
    	if(c=='M'||c=='m') {
    		if(yos>=10) {
    			if(q=="PG") {
    				return 15000;
    			}
    			else {
    				return 10000;
    			}
    		}
    		else {
    			if(q=="PG"||q=="pg") {
    				return 10000;
    			}
    			else {
    				return 7000;
    			}
    		}
    		
    	}
    	else {
    		if(yos>=10) {
    			if(q=="PG"||q=="pg") {
    				return 12000;
    			}
    			else {
    				return 9000;
    			}
    		}
    		else {
    			if(q=="PG") {
    				return 8000;
    			}
    		}
    		
    	}
    	return 0;
    }
    /**
     * Determines the BMI category for a given BMI value.
     *
     * Categories (WHO-style thresholds):
     * - BMI > 30        → "Obese"
     * - 25.0–29.9       → "Overweight"
     * - 18.5–24.9       → "Normal"
     * - BMI < 18.5      → "Under weight"
     *
     * @param bmi the Body Mass Index value
     * @return a string representing the BMI category
     */
    public static String BmiCategory(double a) {
    	if(a>30)return "Obese";
    	else if(25<=a&&a<=29.9)return "Overeight";
    	else if(18.5<=a&&a<=24.9)return "Normal";
    	else if(18.5>=a)return "Underweight";
    	else return "";
    }
    /**
     * Determines the type of triangle based on the lengths
     * of its three sides.
     *
     * Rules:
     * - All three sides equal        → "Equilateral Triangle"
     * - Exactly two sides equal      → "Isosceles Triangle"
     * - All three sides different    → "Scalene Triangle"
     *
     * Note: This method assumes the three sides can form a valid triangle.
     *
     * @param a length of the first side
     * @param b length of the second side
     * @param c length of the third side
     * @return a string describing the triangle type
     */
    public static String TriangleType(int a,int b, int c) {
		if(a==b&&a==c)return "Equilateral Triangle";
		else if (a==b||b==c||a==c)return "Isosceles Triangle";
		else return "Scalene Triangle";
	}
    /**
     * This program determines the Environment based on the given temperature in Celsius.
     * @param a
     * @return A string telling the nature.
     */
    public static String TemperatureClassiication(int a) {
		if(a<=0)return "Freezing";
		else if(1<=a&&a<=15)return "Cold";
		else if(16<=a&&a<=30)return "Warm";
		else if(31<=a&&a<=40)return "Hot";
		else return "Very Hot";
	}
    /**
     * This program will print the Type of the roots and the roots of the given coefficient of the Quadratic Equation.
     * @param a
     * @param b
     * @param c
     */
    public static void QuadraticRoots(int a,int b, int c) {
		int d= (b*b)-(4*a*c);
		if(d>0) {
			double root1=(-b+Math.sqrt(d))/(2*a);
			double root2=(-b-Math.sqrt(d))/(2*a);
			System.out.println("Real and distinct");
			System.out.println(root1+" "+root2);
		}
		else if(d==0) {
			double root = -b/(2*a);
			System.out.println("Real and equal");
			System.out.println(root+" "+root);
		}
		else {
			double realPart=-b/(2*a);
			double imgPart=Math.sqrt(Math.abs(d))/(2*a);
			System.out.println("Real and imaginary");
			System.out.println(realPart+"+"+imgPart+"i");
			System.out.println(realPart+"-"+imgPart+"i");
		}
	}
    /**
     * This program will basically returns the gross salary of the employee based on the HRA and DA.
     * @param basic
     * @param years
     * @return The gross Salary.
     */
    public static int GrossSalaryCalculator(int basic, int years) {

        int hra, da, bonus = 0;
        if (basic <= 10000) 
        {
            hra = basic * 20 / 100;   
            da  = basic * 80 / 100;   
        } 
        else if (basic <= 20000) 
        {
            hra = basic * 25 / 100;   
            da  = basic * 90 / 100;   
        } 
        else 
        {
            hra = basic * 30 / 100;  
            da  = basic * 95 / 100;
        }
        if (years > 3) 
        {
            bonus = 2500;
        }

        int gross = basic + hra + da + bonus;
        return gross;
    }
}
