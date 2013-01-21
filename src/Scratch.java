public class Scratch {
	public static void main(String[] args) {
		short foo = getShort(0xDEADBEEF, 1);
	}

	public static short getShort(int num, int which) {
		for (int i = 0; i < which; i++) {
			num >>= 16;
		}

		num &= 0xFFFF;
		short ret = 0;
		ret |= num;
		return ret;
	}

	public static void d(Object arg) {
		System.out.println(arg);
	}

	public static void p(Object arg) {
		System.out.printf("0x%X\n", arg);
	}
	public static int setNibble(int num, int nibble, int which) {
		System.out.printf("num = 0x%X, nibble=0x%X, which=%d\n", num, nibble,
				which);
		int mask = 0xF;

		for (int i = 0; i < which; i++) {
			nibble = nibble << 4;
			mask <<= 4;
		}
		mask = ~mask;

		num &= mask;
		num |= nibble;
		System.out.printf("Output = 0x%X\n", num);
		return num;
	}

	public static String itostrb(int binary) {
		String ret = new String();

		char digit;

		while (binary > 0) {
			digit = '0';
			if ((binary & 1) == 1) // Binary is odd
			{
				binary--;
				digit = '1';
			}

			ret = digit + ret;

			binary /= 2;
		}
		return ret;
	}

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

	public static int strbtoi(String binary) {
		return 0;
	}

	public static int strdtoi(String decimal) {
		int ret = 0;
		int pow = 1;

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
}
