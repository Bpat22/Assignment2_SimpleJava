/* FibonacciSequence.java
 * Fibonacci Sequence" means each number in sequence is the total of previous two numbers.
 * This program lists the numbers until it reaches to MAX_NUM 10000.
 * starts with 2 numbers as initial value, 0 and 1. 
 * It adds 
 */

import acm.program.ConsoleProgram;

public class FibonacciSequence extends ConsoleProgram{
	// run the code till total reaches 10000
	private static final int MAX_NUM = 10000;

	public void run() {
		println ("This program prints the numbers in Fibonacci Sequence" );
		int a = 0;
		int b = 1;
		int c;

		// code will run until value of a reaches to 10000
		while (a <= MAX_NUM) {
			println(a);
			//sum of previous 2 numbers will store in int c 
			c = a + b;

			//this will assign value of b to a and value of c to b
			a = b;
			b = c;
		}
	}
}
