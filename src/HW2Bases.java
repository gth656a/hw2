/**
 * HW2 Part 1 - Coding with bases
 * 
 * @author [Your name here or you will lose points!]
 * 
 *         *** NOTE: The rules are different for each java file! ***
 * 
 *         You may not use any of the following: - Any functions found in Java
 *         libraries (especially the Math library) - Example Math.pow,
 *         Integer.bitCount, String.valueOf, etc. - Basically, any function that
 *         does everything for you. The purpose of this homework is to learn how
 *         to do these operations yourself, and the Java API! - The only
 *         exception to this rule is String.charAt to get a character from a
 *         String, and you may use String.length to get the size of the string.
 *         - Any Java 7 feature / standard library function (we will be grading
 *         using Java 6)
 * 
 *         - You my not implement any Java library functions as helpers to use
 *         in other functions.
 * 
 *         - String concatenation with a number for more than one digit. - For
 *         example, "" + 123 is banned. "" + 6 is allowed, though.
 * 
 *         - You may only use 2 if-statements max. - This means you may have 2
 *         separate conditions, making this okay:
 * 
 *         if(cond1) { code; } else { moreCode; } if(cond2) { code; } else {
 *         modeCode; }
 * 
 *         - You may not use a switch statement.
 * 
 *         - Recursion is not allowed.
 * 
 *         - You may not reuse any function to implement another function.
 */
public class HW2Bases {
	/**
	 * strdtoi - Decimal String to int
	 * 
	 * Convert a string containing ASCII characters (in decimal) to an int. You
	 * do not have to handle negative numbers. The Strings we will pass in will
	 * be valid decimal numbers, and able to fit in a 32-bit signed integer.
	 * 
	 * Example: strdtoi("123"); // => 123
	 */
	public static int strdtoi(String decimal) {
		int ret = 0;
		int pow = 1; // Variable to hold power of ten

		char cur; // Local variable to hold current char of input string
		int ctod; // Local variable to hold int value of "cur"

		// Loop thru input starting at end
		for (int i = decimal.length() - 1; i > -1; i--) {
			cur = decimal.charAt(i);
			ctod = cur - '0';
			ret += ctod * pow;
			pow *= 10;
		}
		return ret;
	}

	/**
	 * strbtoi - Binary String to int
	 * 
	 * Convert a string containing ASCII characters (in binary) to an int. You
	 * do not have to handle negative numbers. The Strings we will pass in will
	 * be valid binary numbers, and able to fit in a 32-bit signed integer.
	 * 
	 * Example: strbtoi("111"); // => 7
	 */
	public static int strbtoi(String binary) {
		return 0;
	}

	/**
	 * strxtoi - Hexadecimal String to int
	 * 
	 * Convert a string containing ASCII characters (in hex) to an int. You do
	 * not have to handle negative numbers. The Strings we will pass in will be
	 * valid hexadecimal numbers, and able to fit in a 32-bit signed integer.
	 * 
	 * Example: strxtoi("A6"); // => 166
	 */

	public static int strxtoi(String hex) {
		final int BASE = 16;

		int ret = 0;
		int pow = 1;

		char cur;
		int ctod;
		for (int i = hex.length() - 1; i > -1; i--) {
			cur = hex.charAt(i);
			ctod = cur - '0';

			/*
			 * If current hex char is A-F, we need to subtract 7 from ctod so
			 * that if cur = 'A', ctod - '0' = 10
			 */
			if (cur > '9')
				ctod -= 7;
			ret += ctod * pow;
			pow *= BASE;
		}
		return ret;
	}

	/**
	 * itostrb - int to Binary String
	 * 
	 * Convert a int into a String containing ASCII characters (in binary). You
	 * do not have to handle negative numbers. The String returned should
	 * contain the minimum number of characters necessary to represent the
	 * number that was passed in.
	 * 
	 * Example: itostrb(7); // => "111"
	 */
	public static String itostrb(int binary) {
		String ret = new String();
		char digit;

		while (binary != 0) {
			digit = '0';
			if ((binary & 1) == 1) // Binary is odd
			{
				binary--;
				digit = '1';
			}

			ret = digit + ret;

			binary /= 2;
		}

		// Special case where input is 0.
		// Since binary = 0 will result in empty output string, we need to
		// manually
		// set output string to "0" instead.
		if (ret.length() == 0)
			ret = "0";

		return ret;
	}

	/**
	 * itostrx - int to Hexadecimal String
	 * 
	 * Convert a int into a String containing ASCII characters (in hexadecimal).
	 * You do not have to handle negative numbers. The String returned should
	 * contain the minimum number of characters necessary to represent the
	 * number that was passed in.
	 * 
	 * Example: itostrx(166); // => "A6"
	 */
	public static String itostrx(int hex) {
		return "";
	}
}
