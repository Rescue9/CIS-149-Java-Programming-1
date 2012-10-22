/**
File Name: DoubleOut.java
Outputs a floating point number (of type double)
in three different formats:
(1) dollars and cents,
(2) decimal value with the number of digits to the right of
the decimal point specified, and
(3) "e" (scientific) notation: one digit to the left of
the decimal point and the specified number of digits to
the right, followed by the letter "e" and the exponent of 10.
*/

package Ch6.Lab1;

public class DoubleOut {

	/**
	 * Outputs amount in dollars and cents notation. Rounds after two
	 * decimal points. Does not advance to the next line after output.
	 */
	public static void write(double amount){
		if (amount >=0){
			System.out.print('$');
			writePositive(amount);
		}
		else {
			double positiveAmount = -amount;
			System.out.print('$');
			System.out.print('-');
			writePositive(positiveAmount);
		}
	}
	
	// Precondition: amount>=0;
	// Outputs amount in dollars and cents notation. Rounds
	// after two decimal points. Omits the dollar sign
	
	private static void writePositive(double amount){
		int allCents = (int)(Math.round(amount * 100));
		int dollars = allCents / 100;
		int cents = allCents % 100;
		
		System.out.print(dollars);
		System.out.print('.');
		if (cents<10){
			System.out.print('0');
			System.out.print(cents);
		}
		else
			System.out.print(cents);
	}
	
	/**
	 * Outputs amount in dollars and cents notation. Rounds after
	 * two decimal points. Advances to the next line after output.
	 */
	public static void writeln(double amount){
		
		write(amount);
		System.out.println();
	}
	
	/**
	 * Writes out number with digitsAfterPoints digits after
	 * the decimal point Round any extra digits.
	 * Does not advance to the next line after output.
	 */
	private static void write(double number, int digitsAfterPoint){
		if (number>=0)
			writePositive(number, digitsAfterPoint);
		else {
			double positiveNumber = -number;
			System.out.print('-');
			writePositive(positiveNumber, digitsAfterPoint);
		}
	}
	
	// Precondition: number >=0;
	// Writes out number with digitsAfterPoint digits after the
	// decimal point. Rounds any extra digits.
	private static void writePositive(double number, int digitsAfterPoint){
		int mover = (int)(Math.pow(10, digitsAfterPoint));
			// 1 followed by digitsAfterPoint
		int allWhole; //Number with the decimal point
			//moved digitsAfterPoint places
		allWhole = (int)(Math.round(number * mover));
		int beforePoint = allWhole / mover;
		int afterPoint = allWhole % mover;
		
		System.out.print(beforePoint);
		System.out.print('.');
		writeFraction(afterPoint, digitsAfterPoint);
	}
	
	// Outputs the integer afterPoint with enough 0s
	// in front to make it digitsAfterPoint digits long.
	private static void writeFraction(int afterPoint, int digitsAfterPoint){
		int n=1;
		while (n< digitsAfterPoint){
			if(afterPoint < Math.pow(10, n))
				System.out.print('0');
				++n;
		}
		System.out.print(afterPoint);
	}
	
	/**
	 * Writes out number with digitsAfterPoint digits after
	 * the decimal point. Rounds any extra digits.
	 * advances to the next line after output.
	 */
	public static void writeln(double number, int digitsAfterPoint){
		write(number, digitsAfterPoint);
		System.out.println();
	}
	
	// E (SCIENTIFIC) NOTATION
	//Writes out in "e" (scientific) notation
	
	/**
	 * Writes out number in scientific ("e") notation, i.e. with
	 * one (non-zero) digit to the left of the decimal point,
	 * digitsAfterPoint digits after the decimal point, and the
	 * exponent of 10 required to correctly place the decimal point.
	 * Round any extra digits.
	 * Does not advance to the next line after output.
	 */
	private static void scienceWrite(double number, int digitsAfterPoint){
		if (number >= 0)
			scienceWritePositive(number, digitsAfterPoint);
		else {
			double positiveNumber = -number;
			System.out.println('-');
			scienceWritePositive(positiveNumber, digitsAfterPoint);
		}
	}
	
	// Precondition: number >=0
	// Writes out number with one non-zero digit to left of decimal
	// point and digitsAfterPoint digits after the decimal point
	// and the exponent of 10. Rounds any extra digits.
	private static void scienceWritePositive( double number, int digitsAfterPoint){
		int wholePart = (int) number; // Get just the whole part
		int e=0; // initialize exponent
		
		if (wholePart>0){
			
			// Positive exponent = number of divisions by 10
			while (wholePart>=10) {
				
				++e;
				wholePart = wholePart / 10;
			}
		} else {
			
			// Negative exponent = number of multiplications by 10
			double nextValue = number;
			while ((int)nextValue < 1){
				
				--e;
				nextValue = nextValue*10;
			}
		}
		
		int mover = (int)(Math.pow(10, digitsAfterPoint));
			// 1 followed by digitsAfterPoint zeros
		
		int secondMover;
			// Additional decimal point adjuster
			// to obtain digitsAfterPoint digits
		
		int allWhole;
			// Number with the decimal point
			// moved digitsAfterPoint places
		
		if (e<0){
		
			secondMover = (int)(Math.pow(10, -e));
			// pow does not accept negative exponents
			allWhole = (int)(Math.round(number * mover * secondMover));
		} else {
			
			secondMover = (int)(Math.pow(10, e));
			allWhole = (int)(Math.round(number * mover / secondMover));
		}
		
		int beforePoint = allWhole / mover;
		int afterPoint = allWhole % mover;
		
		System.out.print(beforePoint);
		System.out.print('.');
		writeFraction(afterPoint, digitsAfterPoint);
		System.out.print("e" + e);
		
	}
	
	/**
	 * Writes out number in scientific ("e") notation, i.e.
	 * with one digit to the left of the decimal point,
	 * digitsAfterPoint digits after the decimal point, and the 
	 * exponent of 10 required to correctly place the decimal point.
	 * Rounds any extra digits.
	 * Advances to the next line after output.
	 */
	public static void scienceWriteln(double number, int digitsAfterPoint){
		
		scienceWrite(number, digitsAfterPoint);
		System.out.println();
	}
}
