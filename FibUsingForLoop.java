/* FibUsingForLoop.java
 * This program use for loop with max counter along with maxValue
 */

import acm.program.ConsoleProgram;

public class FibUsingForLoop extends ConsoleProgram{
	private static int [] members;

	public static void main(String[] args) {
		// Input the number of terms using a Scanner to take an integer

		int [] members =new int [25];
		int maxvalue = 0;

		members[0] = 0;
		members[1] = 1;
		System.out.println(members[0]);
		System.out.println(members[1]);
		//loop starts at 2 because o and 1 was given as array
		for (int i = 2; maxvalue < 10000; i++) {

			members[i] = members[i-1]+members[i-2];
			maxvalue = members[i];
			//loop exit once it reaches to maxvalue of 10000 
			if (maxvalue<10000){
				System.out.println(members[i]);			
			}

		}	
	}
}
